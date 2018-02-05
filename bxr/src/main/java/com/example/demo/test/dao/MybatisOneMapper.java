package com.example.demo.test.dao;

import com.example.demo.test.model.MybatisOne;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Mapper
//@Repository
//@Service
@CacheConfig(cacheNames = "mybatisOne")
public interface MybatisOneMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MybatisOne record);

    int insertSelective(MybatisOne record);
@Cacheable
    MybatisOne selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MybatisOne record);

    int updateByPrimaryKey(MybatisOne record);
}