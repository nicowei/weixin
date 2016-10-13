package entity.req;

public class ReqMediaMessage extends ReqBaseMessage{
	private String MediaId;
	private String ThumbMediaId;
	public String getMediaId() {
		return MediaId;
	}
	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}
	public String getThumbMediaId() {
		return ThumbMediaId;
	}
	public void setThumbMediaId(String thumbMediaId) {
		ThumbMediaId = thumbMediaId;
	}
	public ReqMediaMessage(String fromUserName, String toUserName, String msgType,
			String createTime, String msgId, String mediaId, String thumbMediaId) {
		super(fromUserName, toUserName, msgType, createTime, msgId);
		MediaId = mediaId;
		ThumbMediaId = thumbMediaId;
	}
	public ReqMediaMessage() {
		super();
	}
	
}
