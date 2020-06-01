package com.example.demo.service.impl;

import com.example.demo.dao.AdminDoMapper;
import com.example.demo.domain.AdminDo;
import com.example.demo.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "adminService")
public class AdminServiceImpl implements AdminService {
    @Resource
    private AdminDoMapper adminDoMapper;
    public List<AdminDo> selectAll() {
        return adminDoMapper.selectAll();
    }
}
