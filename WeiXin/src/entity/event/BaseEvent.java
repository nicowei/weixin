package entity.event;

public class BaseEvent {
	private String FromUserName;
	private String ToUserName;
	private String CreateTime;
	private String MsgType;
	private String Event;
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
	public String getCreateTime() {
		return CreateTime;
	}
	public void setCreateTime(String createTime) {
		CreateTime = createTime;
	}
	public String getMsgType() {
		return MsgType;
	}
	public void setMsgType(String msgType) {
		MsgType = msgType;
	}
	public String getEvent() {
		return Event;
	}
	public void setEvent(String event) {
		Event = event;
	}
	public BaseEvent(String fromUserName, String toUserName, String createTime,
			String msgType, String event) {
		super();
		FromUserName = fromUserName;
		ToUserName = toUserName;
		CreateTime = createTime;
		MsgType = msgType;
		Event = event;
	}
	public BaseEvent() {
		super();
	}
	
}
