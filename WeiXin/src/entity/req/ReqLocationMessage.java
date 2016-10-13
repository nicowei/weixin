package entity.req;

public class ReqLocationMessage extends ReqBaseMessage{
	private String Location_X;
	private String Location_Y;
	private String Scale;
	private String Label;
	public String getLocation_X() {
		return Location_X;
	}
	public void setLocation_X(String location_X) {
		Location_X = location_X;
	}
	public String getLocation_Y() {
		return Location_Y;
	}
	public void setLocation_Y(String location_Y) {
		this.Location_Y = location_Y;
	}
	public String getScale() {
		return Scale;
	}
	public void setScale(String scale) {
		Scale = scale;
	}
	public String getLabel() {
		return Label;
	}
	public void setLabel(String label) {
		Label = label;
	}
	public ReqLocationMessage(String fromUserName, String toUserName,
			String msgType, String createTime, String msgId, String location_X,
			String location_Y, String scale, String label) {
		super(fromUserName, toUserName, msgType, createTime, msgId);
		Location_X = location_X;
		this.Location_Y = location_Y;
		Scale = scale;
		Label = label;
	}
	public ReqLocationMessage() {
		super();
	}
	
}
