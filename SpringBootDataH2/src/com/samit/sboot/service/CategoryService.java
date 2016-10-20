package com.samit.sboot.service;

import com.samit.sboot.domain.Category;
import com.samit.sboot.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService extends AbstractService<Category, Long> {

    private CategoryRepository repository;


    @Autowired    public CategoryService(CategoryRepository repository) {
        super(repository);
        this.repository=repository;
    }

    public List<Category> findByName(String name) {
        return repository.findByName(name);
    }
}