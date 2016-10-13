package entity.event;

public class LocationEvent extends BaseEvent{
	private String Latitude;
	private String Longitude;
	private String Precision;
	public String getLatitude() {
		return Latitude;
	}
	public void setLatitude(String latitude) {
		Latitude = latitude;
	}
	public String getLongitude() {
		return Longitude;
	}
	public void setLongitude(String longitude) {
		Longitude = longitude;
	}
	public String getPrecision() {
		return Precision;
	}
	public void setPrecision(String precision) {
		Precision = precision;
	}
	public LocationEvent(String fromUserName, String toUserName,
			String createTime, String msgType, String event, String latitude,
			String longitude, String precision) {
		super(fromUserName, toUserName, createTime, msgType, event);
		Latitude = latitude;
		Longitude = longitude;
		Precision = precision;
	}
	public LocationEvent() {
		super();
	}
	
}
