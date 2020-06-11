package com.example.demo.service.impl;

import com.example.demo.dao.AdminDoMapper;
import com.example.demo.dao.InstitutionDoMapper;
import com.example.demo.domain.AdminDo;
import com.example.demo.domain.InstitutionDo;
import com.example.demo.domain.UserDo;
import com.example.demo.service.AdminService;
import com.example.demo.service.InstitutionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "institutionService")
public class InstitutionServiceImpl implements InstitutionService {
    @Resource
    private InstitutionDoMapper institutionDoMapper;

    public InstitutionDo selectByID(String id) {
        return institutionDoMapper.getByID(id);
    }

    public List<InstitutionDo> selectInstitutionByType(String type) {
        return institutionDoMapper.selectInstitutionByType(type);
    }

    public void updateState(String id, String isInvalid) {
        institutionDoMapper.updateState(id, isInvalid);
    }
}
