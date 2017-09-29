package org.yunzhong.NewsCollector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class} ,scanBasePackages = "org.yunzhong.NewsCollector")
@EnableSwagger2
public class NewsCollectorApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewsCollectorApplication.class, args);
	}
}
