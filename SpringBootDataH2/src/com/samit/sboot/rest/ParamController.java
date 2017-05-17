package com.samit.sboot.rest;

import com.samit.sboot.domain.Param;
import com.samit.sboot.service.ParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController@RequestMapping("/param")
public class ParamController extends AbstractController<Param, Long> {

    @Autowired    public ParamController(ParamService service) {
        super(service);
    }
}