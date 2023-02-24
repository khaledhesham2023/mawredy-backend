package com.khaledamin.mawardyrestapi.categories;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "categories", schema = "mawredy")
@Data
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id",columnDefinition = "BIGINT")
    private Long id;
    @Column(name = "background",columnDefinition = "VARCHAR(255)")
    private String background;
    @Column(name = "image",columnDefinition = "VARCHAR(255)")
    private String image;
    @Column(name = "title",columnDefinition = "VARCHAR(225)")
    private String title;
    @Column(name = "titleAr",columnDefinition = "VARCHAR(225)")
    private String titleAr;

}
