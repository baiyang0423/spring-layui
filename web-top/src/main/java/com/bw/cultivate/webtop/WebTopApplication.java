package com.bw.cultivate.webtop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication
@MapperScan("com.bw.cultivate.webtop.dao.mapper")
public class WebTopApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebTopApplication.class, args);
	}

}
