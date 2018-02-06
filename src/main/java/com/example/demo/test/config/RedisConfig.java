package com.example.demo.test.config;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.data.redis.cache.RedisCacheManager;
//import org.springframework.data.redis.connection.RedisConnectionFactory;
//import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
//import org.springframework.data.redis.core.RedisTemplate;
//import redis.clients.jedis.JedisPool;
//import redis.clients.jedis.JedisPoolConfig;

/**
 *z77z
 */

@Configuration
@EnableCaching
public class RedisConfig extends CachingConfigurerSupport {

//    @Value("${spring.redis.host}")
//    private String host;
//
//    @Value("${spring.redis.port}")
//    private int port;
//
//    @Value("${spring.redis.timeout}")
//    private int timeout;
//
//    @Value("${spring.redis.pool.max-idle}")
//    private int maxIdle;
//
//    @Value("${spring.redis.pool.max-wait}")
//    private long maxWaitMillis;
//
//    @Bean
//    public JedisPool redisPoolFactory() {
//        Logger.getLogger(getClass()).info("JedisPool注入成功！！");
//        Logger.getLogger(getClass()).info("redis地址：" + host + ":" + port);
//        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
//        jedisPoolConfig.setMaxIdle(maxIdle);
//        jedisPoolConfig.setMaxWaitMillis(maxWaitMillis);
//
//        JedisPool jedisPool = new JedisPool(jedisPoolConfig, host, port, timeout);
//
//        return jedisPool;
//
//    }
}

//        @Bean
//        public JedisConnectionFactory redisConnectionFactory() {
//            JedisConnectionFactory redisConnectionFactory = new JedisConnectionFactory();
//            // Defaults
//            redisConnectionFactory.setHostName("127.0.0.1");
//            redisConnectionFactory.setPort(6379);
//            return redisConnectionFactory;
//        }
//
//        @Bean
//        public RedisTemplate<String, String> redisTemplate(RedisConnectionFactory rf) {
//            RedisTemplate<String, String> redisTemplate = new RedisTemplate<String, String>();
//            redisTemplate.setConnectionFactory(rf);
//            return redisTemplate;
//        }
//
//        @Bean
//        public RedisCacheManager redisCacheManager(RedisTemplate redisTemplate) {
//            RedisCacheManager cacheManager = new RedisCacheManager(redisTemplate);
//
//            // Number of seconds before expiration. Defaults to unlimited (0)
//            cacheManager.setDefaultExpiration(10); // Sets the default expire time (in seconds)
//            return cacheManager;
//        }
   // }


