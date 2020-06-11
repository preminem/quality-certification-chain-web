package com.example.demo.dao;

import com.example.demo.domain.TransactionDo;
import com.example.demo.domain.TransactionDoExample;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TransactionDoMapper {
    int countByExample(TransactionDoExample example);

    int deleteByExample(TransactionDoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TransactionDo record);

    int insertSelective(TransactionDo record);

    List<TransactionDo> selectByExample(TransactionDoExample example);

    TransactionDo selectByPrimaryKey(int id);

    int updateByExampleSelective(@Param("record") TransactionDo record, @Param("example") TransactionDoExample example);

    int updateByExample(@Param("record") TransactionDo record, @Param("example") TransactionDoExample example);

    int updateByPrimaryKeySelective(TransactionDo record);

    int updateByPrimaryKey(TransactionDo record);

    List<TransactionDo> getDataByTime(Date date);

}