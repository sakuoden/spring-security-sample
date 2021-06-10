package com.jtn.springsecuritysample.datasource;

import com.jtn.springsecuritysample.datasource.sample.SampleMapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Transactional
public class ConnectionTest {
    @Autowired
    SampleMapper sampleMapper;

    @Test
    public void Mybatisを利用してDB接続出来る() {
        sampleMapper.insert("テスト");
        assertEquals("テスト", sampleMapper.select("テスト"));
    }
}
