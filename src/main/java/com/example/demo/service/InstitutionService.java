package com.example.demo.service;

import com.example.demo.domain.InstitutionDo;
import com.example.demo.domain.UserDo;

import java.util.List;


public interface InstitutionService {
    InstitutionDo selectByID(String id);

    List<InstitutionDo> selectInstitutionByType(String institutionType);

    void updateState(String id, String isInvalid);
}
