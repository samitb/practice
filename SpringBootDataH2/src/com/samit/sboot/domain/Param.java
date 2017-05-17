package com.samit.sboot.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="PARAM")
public class Param implements IPersistable<Long> {

    @Id @GeneratedValue    @Column (name="PARAM_ID")
    private Long paramId;

    @Column(name = "PARAM_TYPE")
    private String ParamType;

    @Column(name="PARAM_NAME")
    private String paramName;

    @Column(name="PARAM_DESCRIPTION")
    private String paramDescription;

    @Column(name="PARAM_PROPERTIES")
    private String paramProperties;

    public Param() {
    }

    @Override    public Long getId() {
        return getParamId();
    }

    @Override    public void setId(Long paramId) {
        setParamId(paramId);
    }

    public Long getParamId() {
        return paramId;
    }

    public void setParamId(Long paramId) {
        this.paramId = paramId;
    }

    public String getParamType() {
        return ParamType;
    }

    public void setParamType(String paramType) {
        ParamType = paramType;
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public String getParamDescription() {
        return paramDescription;
    }

    public void setParamDescription(String paramDescription) {
        this.paramDescription = paramDescription;
    }

    public String getParamProperties() {
        return paramProperties;
    }

    public void setParamProperties(String paramProperties) {
        this.paramProperties = paramProperties;
    }

    @Override    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Param param = (Param) o;

        if (!paramId.equals(param.paramId)) return false;
        if (!ParamType.equals(param.ParamType)) return false;
        return paramName.equals(param.paramName);

    }

    @Override    public int hashCode() {
        int result = paramId.hashCode();
        result = 31 * result + ParamType.hashCode();
        result = 31 * result + paramName.hashCode();
        return result;
    }
}
