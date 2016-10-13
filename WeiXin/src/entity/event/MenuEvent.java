package entity.event;

public class MenuEvent extends BaseEvent{
	private String EventKey;

	public String getEventKey() {
		return EventKey;
	}

	public void setEventKey(String eventKey) {
		EventKey = eventKey;
	}

	public MenuEvent(String fromUserName, String toUserName, String createTime,
			String msgType, String event, String eventKey) {
		super(fromUserName, toUserName, createTime, msgType, event);
		EventKey = eventKey;
	}

	public MenuEvent() {
		super();
	}
	
}
