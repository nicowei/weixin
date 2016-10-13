package entity.resp;

import java.util.List;

public class RespArticleMessage extends RespBaseMessage{
	private int ArticleCount;
	private List<RespArticle> Articles;

	public int getArticleCount() {
		return ArticleCount;
	}

	public void setArticleCount(int articleCount) {
		ArticleCount = articleCount;
	}

	public List<RespArticle> getArticles() {
		return Articles;
	}

	public void setArticles(List<RespArticle> articles) {
		Articles = articles;
	}
	
}
