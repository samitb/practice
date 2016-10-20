package com.samit.sboot.repository;

import com.samit.sboot.domain.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "ParamRepository")
public interface ParamRepository extends JpaRepository<Param, Long> {
}
