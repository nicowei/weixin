package entity.req;


public class ReqBaseMessage {
	private String FromUserName;
	private String ToUserName;
	private String MsgType;
	private String CreateTime;
	private String MsgId;
	public String getFromUserName() {
		return FromUserName;
	}
	public void setFromUserName(String fromUserName) {
		FromUserName = fromUserName;
	}
	public String getToUserName() {
		return ToUserName;
	}
	public void setToUserName(String toUserName) {
		ToUserName = toUserName;
	}
	public String getMsgType() {
		return MsgType;
	}
	public void setMsgType(String msgType) {
		MsgType = msgType;
	}
	public String getCreateTime() {
		return CreateTime;
	}
	public void setCreateTime(String createTime) {
		CreateTime = createTime;
	}
	public String getMsgId() {
		return MsgId;
	}
	public void setMsgId(String msgId) {
		MsgId = msgId;
	}
	public ReqBaseMessage(String fromUserName, String toUserName,
			String msgType, String createTime, String msgId) {
		super();
		FromUserName = fromUserName;
		ToUserName = toUserName;
		MsgType = msgType;
		CreateTime = createTime;
		MsgId = msgId;
	}
	public ReqBaseMessage() {
		super();
	}
	
}
