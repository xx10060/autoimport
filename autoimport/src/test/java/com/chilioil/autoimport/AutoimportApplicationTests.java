package com.chilioil.autoimport;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@MapperScan("com.chilioil.autoimport.mapper")
class AutoimportApplicationTests {

    @Test
    void contextLoads() {
    }

}
