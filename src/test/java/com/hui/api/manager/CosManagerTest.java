package com.hui.api.manager;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * Cos 操作测试
 *
 * @author dargon
 */
@SpringBootTest
class CosManagerTest {

    @Resource
    private CosManager cosManager;

    @Test
    void putObject() {
        cosManager.putObject("test", "test.json");
    }
}