package com.lls.config;

import org.springframework.boot.autoconfigure.data.redis.RedisProperties.Jedis;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class MyConfig {
	@Bean
	public Jedis getJedis() {
		return new Jedis();
	}
}
