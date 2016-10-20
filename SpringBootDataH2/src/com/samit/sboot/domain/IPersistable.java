package com.samit.sboot.domain;


public interface IPersistable<ID> {
    ID getId();
    void setId(ID id);
}
