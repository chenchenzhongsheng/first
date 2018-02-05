package com.example.demo.test.service;

import com.example.demo.test.model.MybatisOne;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018\2\2 0002.
 */
@Mapper
@Repository
@Service
public interface MybatisOneService {
//    int deleteByPrimaryKey(Long id);
//
//    int insert(MybatisOne record);
//
//    int insertSelective(MybatisOne record);

    MybatisOne selectByPrimaryKey(Long id);

//    int updateByPrimaryKeySelective(MybatisOne record);
//
//    int updateByPrimaryKey(MybatisOne record);
}
