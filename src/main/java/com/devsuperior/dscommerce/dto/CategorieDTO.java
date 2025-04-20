package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.Category;

public class CategorieDTO {

    private Long id;
    private String name;

    public CategorieDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public CategorieDTO(Category entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
