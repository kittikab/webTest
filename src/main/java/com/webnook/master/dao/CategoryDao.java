package com.webnook.master.dao;

import java.util.List;

import com.webnook.master.entity.Category;

public interface CategoryDao {

	int createCategory(Category category);
	void deleteCategory(Category category);
	int editCategory(Category category);
	
	List<Category> getAllCategories();
}
