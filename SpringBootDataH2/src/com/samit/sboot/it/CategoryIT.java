package com.samit.sboot.it;

import com.samit.sboot.domain.Category;
import com.samit.sboot.repository.CategoryRepository;
import com.samit.sboot.rest.CategoryController;
import junit.framework.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CategoryIT extends AbstractIT<Category, Long> {

    private CategoryController controller;
    private CategoryRepository repository;
    private final static String CATEGORY_URL_PREFIX ="category";

    @Autowired    public void setCategoryController(CategoryController controller) {
        this.controller=controller;
        super.setController(controller);
    }

    @Autowired    public void setCategoryRepository(CategoryRepository repository) {
        this.repository=repository;
        super.setRepository(repository);
    }

    public CategoryIT() {
        super(CATEGORY_URL_PREFIX, Category.class);
    }

    @Test    public void findByNameTest() throws Exception {
        Category entity=getTestEntity();
        entity.setCategoryName("Hello world!");
        repository.save(entity);

        String json= templateGetRequest("/" + CATEGORY_URL_PREFIX + "/findByName/world");
        List<Category> returned=(List<Category>)jsonToObject(json);
        Assert.assertTrue("", returned.get(0).getCategoryName().equals("Hello world!"));

    }

}
