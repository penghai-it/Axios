package it.ph.springboot.vue.axios;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("it.ph.springboot.vue.axios.dao")
public class AxiosApplication {

	public static void main(String[] args) {
		SpringApplication.run(AxiosApplication.class, args);
	}

}
