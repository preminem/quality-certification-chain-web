package com.example.demo.dao;


import com.example.demo.domain.UserDo;
import com.example.demo.domain.UserDoExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import javax.jws.soap.SOAPBinding;
import java.util.List;

@Mapper
public interface UserDoMapper {
    int countByExample(UserDoExample example);

    int deleteByExample(UserDoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserDo record);

    int insertSelective(UserDo record);

    List<UserDo> selectByExample(UserDoExample example);

    UserDo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserDo record, @Param("example") UserDoExample example);

    int updateByExample(@Param("record") UserDo record, @Param("example") UserDoExample example);

    int updateByPrimaryKeySelective(UserDo record);

    int updateByPrimaryKey(UserDo record);

    UserDo selectUserByUserName(String name);

    UserDo selectUserByID(int id);

    void updateAdmin(UserDo userDo);

    List<UserDo> selectUserByInstType(String institutionType);

    List<UserDo> selectOKUserByInstType(String institutionType);

    void updateState(@Param("id") Integer id, @Param("userStates") Integer userStates, @Param("remark") String remark, @Param("remarks") String remarks);

    void updateUser(UserDo userDo);

    void updatePassword(@Param("id") int id, @Param("password") String password);

    List<UserDo> selectUserByTnstitutionNumber(String institutionNumber);

    List<UserDo> selectAll();
}