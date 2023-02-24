package com.khaledamin.mawardyrestapi.categories;

import com.khaledamin.mawardyrestapi.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/V1")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/getAllCategories")
    public ResponseEntity<BaseResponse<List<CategoryEntity>>> getAllCategories() {
        return new ResponseEntity<>(categoryService.getAllCategories(),HttpStatus.OK);
    }
}
