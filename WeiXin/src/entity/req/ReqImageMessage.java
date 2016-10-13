package entity.req;

public class ReqImageMessage extends ReqBaseMessage{
	private String PicUrl;
	private String MediaId;
	public String getPicUrl() {
		return PicUrl;
	}
	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}
	public String getMediaId() {
		return MediaId;
	}
	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}
	public ReqImageMessage(String fromUserName, String toUserName, String msgType,
			String createTime, String msgId, String picUrl, String mediaId) {
		super(fromUserName, toUserName, msgType, createTime, msgId);
		PicUrl = picUrl;
		MediaId = mediaId;
	}
	public ReqImageMessage() {
		super();
	}
	
}
