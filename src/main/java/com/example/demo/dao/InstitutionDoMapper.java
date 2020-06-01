package com.example.demo.dao;


import java.util.List;

import com.example.demo.domain.InstitutionDo;
import com.example.demo.domain.InstitutionDoExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface InstitutionDoMapper {
    int countByExample(InstitutionDoExample example);

    int deleteByExample(InstitutionDoExample example);

    int deleteByPrimaryKey(String institutionNumber);

    int insert(InstitutionDo record);

    int insertSelective(InstitutionDo record);

    List<InstitutionDo> selectByExample(InstitutionDoExample example);

    InstitutionDo selectByPrimaryKey(String institutionNumber);

    int updateByExampleSelective(@Param("record") InstitutionDo record, @Param("example") InstitutionDoExample example);

    int updateByExample(@Param("record") InstitutionDo record, @Param("example") InstitutionDoExample example);

    int updateByPrimaryKeySelective(InstitutionDo record);

    int updateByPrimaryKey(InstitutionDo record);

    InstitutionDo getByID(String institution_number);
}