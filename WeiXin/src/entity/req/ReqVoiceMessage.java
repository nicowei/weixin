package entity.req;

public class ReqVoiceMessage extends ReqBaseMessage{
	private String MediaId;
	private String Format;
	private String Recognition;
	public String getMediaId() {
		return MediaId;
	}
	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}
	public String getFormat() {
		return Format;
	}
	public void setFormat(String format) {
		Format = format;
	}
	public String getRecognition() {
		return Recognition;
	}
	public void setRecognition(String recognition) {
		Recognition = recognition;
	}
	public ReqVoiceMessage(String fromUserName, String toUserName, String msgType,
			String createTime, String msgId, String mediaId, String format,
			String recognition) {
		super(fromUserName, toUserName, msgType, createTime, msgId);
		MediaId = mediaId;
		Format = format;
		Recognition = recognition;
	}
	public ReqVoiceMessage() {
		super();
	}

}
