package com.khaledamin.mawardyrestapi.categories;

import com.khaledamin.mawardyrestapi.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepo categoryRepo;

    public BaseResponse<List<CategoryEntity>> getAllCategories() {
        List<CategoryEntity> list = categoryRepo.findAll();
        return new BaseResponse<>(true,"Categories retrieved successfully",list);
    }
}
