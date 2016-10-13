package entity.resp;

public class RespTextMessage extends RespBaseMessage{
	private String Content;

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public RespTextMessage(String fromUserName, String toUserName,
			String msgType, String createTime, String content) {
		super(fromUserName, toUserName, msgType, createTime);
		Content = content;
	}

	public RespTextMessage() {
		super();
	}
	
	
}
