package com.example.demo.service;

import com.example.demo.domain.TransactionDo;
import com.example.demo.domain.TransactionDoExample;

import java.util.Date;
import java.util.List;

public interface UploadService {

    void insertTrancDate(TransactionDo transactionDo);

    List<TransactionDo> selectDataByTrancId(String id,String datatype);
    List<TransactionDo> selectByExample(TransactionDoExample example);
    List<TransactionDo> selectDataByType(String datatype);
    TransactionDo selectById(int id);

    void updateById(TransactionDo transactionDo);

    List<TransactionDo> getByTime(Date date);

}
