package com.samit.sboot.it;

import com.samit.sboot.domain.Param;
import com.samit.sboot.repository.ParamRepository;
import com.samit.sboot.rest.ParamController;
import org.springframework.beans.factory.annotation.Autowired;

public class ParamIT extends AbstractIT<Param, Long> {

    private ParamController controller;
    private ParamRepository repository;

    public ParamIT() {
        super("param", Param.class);
    }

    @Autowired    public void setController(ParamController controller) {
        this.controller = controller;
        super.setController(controller);
    }

    @Autowired    public void setRepository(ParamRepository repository) {
        this.repository = repository;
        super.setRepository(repository);
    }
}
