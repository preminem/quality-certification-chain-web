package com.example.demo.service.impl;


import com.example.demo.dao.UserDoMapper;
import com.example.demo.domain.UserDo;
import com.example.demo.domain.UserDoExample;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDoMapper userMapper;
    public UserDo selectUserByUserName(String name){
        return userMapper.selectUserByUserName(name);
    }
    public UserDo selectUserByID(int id){
        return userMapper.selectUserByID(id);
    }
    public void insertUser(UserDo userDo){
        userMapper.insert(userDo);
    }
    public void updateAdmin(UserDo userDo){
        userMapper.updateAdmin(userDo);
    }
    public List<UserDo> getByInstType(String type){
        return userMapper.selectUserByInstType(type);
    }
    public List<UserDo> getOKByInstType(String type){
        return userMapper.selectOKUserByInstType(type);
    }
    public void updateState(Integer id,Integer userStates,String remark,String remarks){
        userMapper.updateState(id,userStates,remark,remarks);
    }
    public List<UserDo> selectByExample(UserDoExample example){
        return userMapper.selectByExample(example);
    }

    @Override
    public List<UserDo> selectAll() {
        return userMapper.selectAll();
    }

    public void updateUser(UserDo userDo){
        userMapper.updateUser(userDo);
    }
    public void updatePassword(int id,String password){
        userMapper.updatePassword(id,password);
    }
    public List<UserDo> selectUserByTnstitutionNumber(String institutionNumber){
        return userMapper.selectUserByTnstitutionNumber(institutionNumber);
    }
}
