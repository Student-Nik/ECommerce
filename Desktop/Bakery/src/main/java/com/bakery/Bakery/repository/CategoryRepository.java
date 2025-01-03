package com.bakery.Bakery.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bakery.Bakery.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer>{

}
