package controllor;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.req.ReqBaseMessage;
import entity.req.ReqTextMessage;
import entity.resp.RespTextMessage;
import util.MapToXML;
import util.ParseXml;
import util.SignUtil;

/**
 * Servlet implementation class Sign
 */
@SuppressWarnings("unused")
@WebServlet("/sign")
public class Sign extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String token = "test132";

	public Sign() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String signature = request.getParameter("signature");
		String timestamp = request.getParameter("timestamp");
		String nonce = request.getParameter("nonce");
		String echostr = request.getParameter("echostr");

		boolean flag = SignUtil.checkSignature(token, signature, timestamp, nonce);
		if (flag) {
			response.getWriter().write(echostr);
		} else {
			response.getWriter().write("success");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			Map<String, String> map = ParseXml.parseXml(request);
			ReqTextMessage rMessage = new ReqTextMessage(map.get("FromUserName"), map.get("ToUserName"),
					map.get("MsgType"), map.get("CreateTime"), map.get("MsgId"), map.get("Content"));

			RespTextMessage sMessage = new RespTextMessage(rMessage.getToUserName(), rMessage.getFromUserName(),
					rMessage.getMsgType(), String.valueOf(new Date().getTime()), rMessage.getContent());
			
			Map<String,String> returnMap = new HashMap<String,String>();
			returnMap.put("ToUserName", sMessage.getToUserName());
			returnMap.put("FromUserName", sMessage.getFromUserName());
			returnMap.put("CreateTime", sMessage.getCreateTime());
			returnMap.put("MsgType", sMessage.getMsgType());
			returnMap.put("Content", sMessage.getContent());
			String msg = MapToXML.mapToXml(returnMap);
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
