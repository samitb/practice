package com.samit.sboot.service;

import com.samit.sboot.domain.Param;
import com.samit.sboot.repository.ParamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParamService extends AbstractService<Param, Long> {

    private ParamRepository paramRepository;

    @Autowired    public ParamService(ParamRepository paramRepository) {
        super(paramRepository);
        this.paramRepository=paramRepository;

    }

}