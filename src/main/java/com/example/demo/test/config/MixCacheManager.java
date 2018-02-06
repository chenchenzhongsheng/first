package com.example.demo.test.config;

import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Administrator on 2018\2\2 0002.
 */
public class MixCacheManager {
    private CacheManager redisCacheManager;
    private CacheManager memCacheManager;


    private String redisPrefix = "redis-";

    public Cache getCache(String arg0) {
        if (arg0.startsWith(redisPrefix))
            return redisCacheManager.getCache(arg0);
        else
            return memCacheManager.getCache(arg0);
    }

    public Collection<String> getCacheNames() {
        Collection<String> cacheNames = new ArrayList<String>();
        if (redisCacheManager != null) {
            cacheNames.addAll(redisCacheManager.getCacheNames());
        }
        if (memCacheManager != null) {
            cacheNames.addAll(memCacheManager.getCacheNames());
        }
        return cacheNames;
    }







    public CacheManager getRedisCacheManager() {
        return redisCacheManager;
    }

    public void setRedisCacheManager(CacheManager redisCacheManager) {
        this.redisCacheManager = redisCacheManager;
    }

    public CacheManager getMemCacheManager() {
        return memCacheManager;
    }

    public void setMemCacheManager(CacheManager memCacheManager) {
        this.memCacheManager = memCacheManager;
    }

    public String getRedisPrefix() {
        return redisPrefix;
    }

    public void setRedisPrefix(String redisPrefix) {
        this.redisPrefix = redisPrefix;
    }
}
