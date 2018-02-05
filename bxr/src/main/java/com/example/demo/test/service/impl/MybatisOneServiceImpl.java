package com.example.demo.test.service.impl;

import com.example.demo.test.dao.MybatisOneMapper;
import com.example.demo.test.model.MybatisOne;
import com.example.demo.test.service.MybatisOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018\2\2 0002.
 */



@Service
@RestController
public class MybatisOneServiceImpl implements MybatisOneService {
    @Autowired
    private MybatisOneMapper mybatisOneMapper;

    @Override
    public MybatisOne selectByPrimaryKey(Long id) {
        return mybatisOneMapper.selectByPrimaryKey(id);
    }
}
