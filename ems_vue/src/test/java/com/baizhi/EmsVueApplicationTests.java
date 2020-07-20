package com.baizhi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
class EmsVueApplicationTests {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    private RedisTemplate redisTemplate;
    @Test
    public void text() {
        stringRedisTemplate.opsForValue().set("name","张三");
    }

}
