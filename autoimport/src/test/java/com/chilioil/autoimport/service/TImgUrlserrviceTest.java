package com.chilioil.autoimport.service;

import com.alibaba.fastjson.JSON;
import com.chilioil.autoimport.bo.TImgUrlBo;
import com.chilioil.autoimport.mapper.TImgUrlMapperMgr;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
@Slf4j
class TImgUrlserrviceTest {

    @Autowired
    private TImgUrlMapperMgr tImgUrlMapperMgr;


    @Test
    public void tt(){
        List<TImgUrlBo> data =  tImgUrlMapperMgr.selectAll();
        for(TImgUrlBo m : data) {
            log.info("解析到一条数据:{}", JSON.toJSONString(m));
        }
    }
}