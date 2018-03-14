package com.example.demo.mapper;

import com.example.demo.entity.Aa;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface AaMapper {
      
//    @Select("select * from t_aa where id = #{id}")
    Aa findCityById(@Param("id") int id);
}  