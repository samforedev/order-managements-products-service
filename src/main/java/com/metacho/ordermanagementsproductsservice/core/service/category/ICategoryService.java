package com.metacho.ordermanagementsproductsservice.core.service.category;

import com.metacho.ordermanagementsproductsservice.core.domain.category.Category;

import java.util.List;
import java.util.UUID;

public interface ICategoryService {
    UUID createCategory(Category category);
    Category getCategory(UUID id);
    List<Category> getAllCategories();
    UUID updateCategory(Category category);
    UUID deleteCategory(UUID id);
}
