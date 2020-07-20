package com.baizhi.cache;

import com.baizhi.utils.ApplicationContextUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.cache.Cache;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @ author bannerblade
 * @ date 2020/7/19
 */
@Slf4j
public class RedisCache implements Cache {
    //缓存开发好了在EmpMapper里面，配置使用

    //RedisCache对象由mybatis实例化，spring工厂拿不到这个对象的创建
    //没法直接使用spring的注入语法，所以要开发工具类ApplicationContextUtils
    private String id;

    public RedisCache(String id){
        //要用redis缓存必须在这里面注入redistmplate
        log.info("当前的缓存id：[{}]", id);
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override//放入redis缓存
    public void putObject(Object key, Object value) {
        log.info("放入缓存的key:[{}] 放入缓存的value:[{}]", key,value);
        getRedisTemplate().opsForHash().put(id,key.toString(),value);
    }

    @Override//获取redis缓存
    public Object getObject(Object key) {
        log.info("获取缓存的key:[{}]", key.toString());
        return getRedisTemplate().opsForHash().get(id,key.toString());
    }

    @Override//删除指定缓存信息
    public Object removeObject(Object o) {
        return null;
    }

    @Override//清除缓存
    public void clear() {
        log.info("清除所有缓存信息...");
        getRedisTemplate().delete(id);
    }

    @Override
    public int getSize() {
        return getRedisTemplate().opsForHash().size(id).intValue();
    }

    //封装获取redistemplate的方法
    public RedisTemplate getRedisTemplate(){
        RedisTemplate redisTemplate = (RedisTemplate) ApplicationContextUtils.getBean("redisTemplate");
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setHashKeySerializer(new StringRedisSerializer());
        return redisTemplate;
    }
}
