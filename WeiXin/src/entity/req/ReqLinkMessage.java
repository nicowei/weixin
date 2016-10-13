package entity.req;

public class ReqLinkMessage extends ReqBaseMessage {
	private String Title;
	private String Description;
	private String Url;
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getUrl() {
		return Url;
	}
	public void setUrl(String url) {
		Url = url;
	}
	public ReqLinkMessage(String fromUserName, String toUserName, String msgType,
			String createTime, String msgId, String title, String description,
			String url) {
		super(fromUserName, toUserName, msgType, createTime, msgId);
		Title = title;
		Description = description;
		Url = url;
	}
	public ReqLinkMessage() {
		super();
	}
	
}
