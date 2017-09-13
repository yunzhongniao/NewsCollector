package org.yunzhong.NewsCollector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="org.yunzhong.NewsController")
public class NewsCollectorApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewsCollectorApplication.class, args);
	}
}
