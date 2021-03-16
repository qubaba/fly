package com.qubaba.rediscommon.support;

import org.springframework.data.redis.core.RedisTemplate;

/**
 * 定义redis的相关操作
 *
 * @author QuPeng
 * @date 2021/3/16
 */
public class RedisOperation {

    private RedisTemplate<String, Object> redisTemplate;

    public RedisTemplate<String, Object> getRedisTemplate() {
        return redisTemplate;
    }

    public void setRedisTemplate(RedisTemplate<String, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }
}
