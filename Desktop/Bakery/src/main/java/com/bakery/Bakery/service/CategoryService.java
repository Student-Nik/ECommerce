package com.bakery.Bakery.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bakery.Bakery.model.Category;
import com.bakery.Bakery.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public void addCategory(Category category) {
		categoryRepository.save(category);
	}

	public List<Category> getAllCategories() {
		return categoryRepository.findAll();
	}
	
	public void removeCategoryById(int id) {
		categoryRepository.deleteById(id);
	}

	public Optional<Category> getCategoryById(int id) {
		return categoryRepository.findById(id);
	}
}
