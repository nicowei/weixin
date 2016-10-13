package entity.resp;

public class RespBaseMessage {
	private String FromUserName;
	private String ToUserName;
	private String MsgType;
	private String CreateTime;
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
	public RespBaseMessage(String fromUserName, String toUserName,
			String msgType, String createTime) {
		super();
		FromUserName = fromUserName;
		ToUserName = toUserName;
		MsgType = msgType;
		CreateTime = createTime;
	}
	public RespBaseMessage() {
		super();
	}
	
}
