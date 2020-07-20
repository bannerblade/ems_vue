package com.baizhi.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextUtils implements ApplicationContextAware {
    //在springboot启动成功后，如果我们当前的的对象实现了ApplicationContextAware
    //它会把当前springboot自动创建的工程拿给我们。
    private static ApplicationContext applicationContext;//保存工程

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;//赋值，让我们拿到对应的ApplicationContext
    }


    //名字默认有redisTemplate  stringRedisTemplate
    //核心是获取redisTemplate，静态方法里只能用静态成员
    //根据名字获取对象
    public static Object getBean(String name){
        return applicationContext.getBean(name);
    }

}
