package com.khaledamin.mawardyrestapi.categories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepo extends JpaRepository<CategoryEntity,Long> {
    @Query(value = "SELECT * FROM categories;",nativeQuery = true)
    CategoryEntity getAllCategories();
}
