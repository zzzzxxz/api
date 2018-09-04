package cn.xyzs.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;

import java.util.Properties;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}
	@Bean
	public MapperScannerConfigurer create(){
		MapperScannerConfigurer config = new MapperScannerConfigurer();
		//设置mapper文件的包
		config.setBasePackage("cn.xyzs.api.mapper");
		//固定配置
		Properties p = new Properties();
		p.setProperty("mappers","tk.mybatis.mapper.common.Mapper");
		config.setProperties(p);
		return config;
	}



}
