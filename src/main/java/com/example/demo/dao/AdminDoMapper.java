package com.example.demo.dao;


import java.util.List;

import com.example.demo.domain.AdminDo;
import com.example.demo.domain.AdminDoExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface AdminDoMapper {
    int countByExample(AdminDoExample example);

    int deleteByExample(AdminDoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdminDo record);

    int insertSelective(AdminDo record);

    List<AdminDo> selectByExample(AdminDoExample example);

    AdminDo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdminDo record, @Param("example") AdminDoExample example);

    int updateByExample(@Param("record") AdminDo record, @Param("example") AdminDoExample example);

    int updateByPrimaryKeySelective(AdminDo record);

    int updateByPrimaryKey(AdminDo record);

    List<AdminDo> selectAll();
}