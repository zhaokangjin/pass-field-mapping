package com.platform.field.mapping.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
	@Bean
	public Docket commonDocket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo("测试环境接口"))
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.platform.field.mapping.provider"))
				.paths(PathSelectors.any())
				.build();
	}

	// 设置文档信息
	private ApiInfo apiInfo(String desc) {
		return new ApiInfoBuilder()
				// 页面标题
				.title(desc)
				// 设置作者联系方式,可有可无
				.contact(new Contact("kangjin.zhao", "", "270882007@qq.com"))
				// 版本号
				.version("1.0")
				// 描述
				.description("本API仅用于测试环境").build();
	}
}
