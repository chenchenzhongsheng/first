package com.example.demo.test.web;

import com.example.demo.test.dao.MybatisOneMapper;
import com.example.demo.test.model.MybatisOne;
import com.example.demo.test.service.MybatisOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018\2\2 0002.
 */
@RestController
public class FirstController {
    @Autowired
    MybatisOneService mybatisOneService;
    @Autowired
    MybatisOneMapper mybatisOneMapper;

    @RequestMapping(value = "/mybatis/{id}",method = RequestMethod.GET)

    public MybatisOne  First(@PathVariable Long id) {
        System.out.println(id);

      MybatisOne mybatisOne=mybatisOneMapper.selectByPrimaryKey(id);
      //  MybatisOne mybatisOne=mybatisOneService.selectByPrimaryKey(id);
        System.out.println(mybatisOne);
        return mybatisOne;
    }
    @RequestMapping(value = "/mybatis/add",method = RequestMethod.POST)

    public MybatisOne  Two( Long id,String mName,Integer mAge) {
        System.out.println("id "+id+" mName "+mName+" mAge "+mAge);
    MybatisOne mybatisTwo=new MybatisOne();
    mybatisTwo.setId(id);
    mybatisTwo.setmName(mName);
    mybatisTwo.setmAge(mAge);
       int i=mybatisOneMapper.insert(mybatisTwo);
        //  MybatisOne mybatisOne=mybatisOneService.selectByPrimaryKey(id);
        System.out.println(i);
        return null;
    }
    @RequestMapping(value = "/mybatis/delete/{id}",method = RequestMethod.DELETE)

    public void  Three(@PathVariable Long id) {
        System.out.println(id);

    mybatisOneMapper.deleteByPrimaryKey(id);
         }

    @RequestMapping(value = "/mybatis/update",method = RequestMethod.PUT)

    public MybatisOne  Four( Long id,String mName,Integer mAge) {
        System.out.println("id "+id+" mName "+mName+" mAge "+mAge);
        MybatisOne mybatisFour=new MybatisOne();
        mybatisFour.setId(id);
        mybatisFour.setmName(mName);
        mybatisFour.setmAge(mAge);
        int i=mybatisOneMapper.updateByPrimaryKey(mybatisFour);
        //  MybatisOne mybatisOne=mybatisOneService.selectByPrimaryKey(id);
        System.out.println(i);
        return mybatisFour;
    }


}
