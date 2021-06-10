package com.jtn.springsecuritysample.datasource.sample;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SampleMapper {
    void insert(@Param("sample") String sample);
    String select(@Param("sample") String sample);
}
