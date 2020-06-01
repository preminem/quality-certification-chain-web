package com.example.demo.service;

import com.example.demo.domain.UserDo;
import com.example.demo.domain.UserDoExample;

import java.util.List;


public interface UserService {
     UserDo selectUserByUserName(String name);
     UserDo selectUserByID(int id);
     void insertUser(UserDo userDo);
     void updateAdmin(UserDo userDo);
     List<UserDo> getByInstType(String type);
     List<UserDo> getOKByInstType(String type);
     void updateState(Integer id,Integer userStates,String remark,String remarks);
     void updateUser(UserDo userDo);
     void updatePassword(int id,String password);
     List<UserDo> selectUserByTnstitutionNumber(String institutionNumber);
     List<UserDo> selectByExample(UserDoExample example);
     List<UserDo> selectAll();
}
