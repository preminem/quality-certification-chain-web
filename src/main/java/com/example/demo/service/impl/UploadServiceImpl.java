package com.example.demo.service.impl;

import com.example.demo.dao.TransactionDoMapper;
import com.example.demo.domain.TransactionDo;
import com.example.demo.domain.TransactionDoExample;
import com.example.demo.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service(value = "uploadService")
public class UploadServiceImpl implements UploadService {

    @Autowired
    TransactionDoMapper transactionDoMapper;

    @Override
    public void insertTrancDate(TransactionDo transactionDo) {
         transactionDoMapper.insertSelective(transactionDo);
    }

    @Override
    public List<TransactionDo> selectDataByTrancId(String id,String datatype) {
        TransactionDoExample transactionDoExample = new TransactionDoExample();
        transactionDoExample.createCriteria().andUnittypeEqualTo(id).andTemp3EqualTo(datatype).andIscheckedEqualTo("0");
        return transactionDoMapper.selectByExample(transactionDoExample);

    }

    @Override
    public List<TransactionDo> selectByExample(TransactionDoExample example) {
        return transactionDoMapper.selectByExample(example);
    }

    @Override
    public List<TransactionDo> selectDataByType(String datatype) {
        TransactionDoExample transactionDoExample = new TransactionDoExample();
        transactionDoExample.createCriteria().andTemp3EqualTo(datatype).andIscheckedEqualTo("0");
        return transactionDoMapper.selectByExample(transactionDoExample);
    }

    @Override
    public TransactionDo selectById(int id) {

        return transactionDoMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateById(TransactionDo transactionDo) {
        transactionDoMapper.updateByPrimaryKeySelective(transactionDo);
    }

    @Override
    public List<TransactionDo> getByTime(Date date){
        return transactionDoMapper.getDataByTime(date);
    }
}
