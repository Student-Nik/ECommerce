package com.bakery.Bakery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.bakery.Bakery.service.CategoryService;
import com.bakery.Bakery.service.ProductService;


@Controller
public class HomeController {
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private ProductService productService;
	
	@GetMapping({"/", "/home"})
	public String getHome(Model model) {
		return "index";
	}
	
	@GetMapping("/shop")
	public String getShop(Model model) {
		model.addAttribute("categories", categoryService.getAllCategories());
		model.addAttribute("products", productService.getAllProducts());
		return "shop";
	}
	
	@GetMapping("/shop/category/{id}")
	public String ShopByCategory(Model model, @PathVariable int id) {
		model.addAttribute("categories", categoryService.getAllCategories());
		model.addAttribute("products", productService.getAllProductsByCategoryId(id));
		return "shop";
	}
	
	@GetMapping("/shop/viewproduct/{id}")
	public String viewProduct(Model model, @PathVariable int id) {
		model.addAttribute("product", productService.getProductById(id).get());
		return "viewProduct";
	}

}
