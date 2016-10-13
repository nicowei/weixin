package entity.event;

public class QRCodeEvent extends BaseEvent {
	private String EventKey;
	private String Ticket;

	public String getEventKey() {
		return EventKey;
	}

	public void setEventKey(String eventKey) {
		EventKey = eventKey;
	}

	public String getTicket() {
		return Ticket;
	}

	public void setTicket(String ticket) {
		Ticket = ticket;
	}

	public QRCodeEvent(String fromUserName, String toUserName,
			String createTime, String msgType, String event, String eventKey,
			String ticket) {
		super(fromUserName, toUserName, createTime, msgType, event);
		EventKey = eventKey;
		Ticket = ticket;
	}

	public QRCodeEvent() {
		super();
	}

}
