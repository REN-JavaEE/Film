package com.lls.config;

import org.springframework.boot.autoconfigure.data.redis.RedisProperties.Jedis;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class MyConfig {
@Bean
public RestTemplate getRestTemplate() {
	return new RestTemplate();
}
@Bean
public Jedis getJedis() {
	return new Jedis();
}
}
