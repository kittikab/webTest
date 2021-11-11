package com.webnook.master.dao;



import java.util.List;

import com.webnook.master.entity.Article;

public interface ArticleDao {

	int createArticle(Article article);
	
	int editArticle(Article article);
	
	void deleteArticle(int id);
	
	Article getArticleById(int id);
	
	List<Article> getAllArticles();
}
