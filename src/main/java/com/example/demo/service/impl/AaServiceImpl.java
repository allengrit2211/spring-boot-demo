package com.example.demo.service.impl;


import com.example.demo.entity.Aa;
import com.example.demo.mapper.AaMapper;
import com.example.demo.service.AaService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AaServiceImpl implements AaService {

    @Autowired
    AaMapper aaMapper;

    public Aa findCityById(int id){
        return aaMapper.findCityById(id);
    }

}
