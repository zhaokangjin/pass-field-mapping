package com.platform.field.mapping.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Api：修饰整个类，描述Controller的作用
 * @ApiOperation：描述一个类的一个方法，或者说一个接口
 * @ApiParam：单个参数描述
 * @ApiModel：用对象来接收参数
 * @ApiProperty：用对象接收参数时，描述对象的一个字段
 * @ApiResponse：HTTP响应其中1个描述
 * @ApiResponses：HTTP响应整体描述
 * @ApiIgnore：使用该注解忽略这个API
 * @ApiError ：发生错误返回的信息
 * @ApiParamImplicitL：一个请求参数
 * @ApiParamsImplicit 多个请求参数
 * @ApiImplicitParams
 * @author kangjin.zhao@accenture
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
	@Bean
	public Docket commonDocket() {
		// http://127.0.0.1:12010/field/v2/api-docs 查看数据JSON
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo("测试环境接口")).select().apis(RequestHandlerSelectors.basePackage("com.platform.**.provider")).paths(PathSelectors.any()).build();
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
