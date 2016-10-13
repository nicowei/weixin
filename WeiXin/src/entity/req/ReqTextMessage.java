package entity.req;

public class ReqTextMessage extends ReqBaseMessage{

	private String Content;

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public ReqTextMessage(String fromUserName, String toUserName, String msgType,
			String createTime, String msgId, String content) {
		super(fromUserName, toUserName, msgType, createTime, msgId);
		Content = content;
	}

	public ReqTextMessage() {
		super();
	}
	
}
