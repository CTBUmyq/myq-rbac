package com.muyiquan.rbac.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger文档生成配置
 * 
 * @author Huangys
 *
 */
@Configuration
@EnableSwagger2
@ComponentScan(basePackages = { "com.muyiquan.rbac.controller" })
public class SwaggerConfig {
	// 处理的地址
	public static final String DEFAULT_INCLUDE_PATTERN = "/.*";

	@Bean
	public Docket docket() {
		Docket docket = new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(ApiInfo()).forCodeGeneration(true)
				// .genericModelSubstitutes(ResponseEntity.class)//
				// .ignoredParameterTypes(pageinfo.class)
				// .ignoredParameterTypes(HttpSession.class).ignoredParameterTypes(java.sql.Date.class)
				// .directModelSubstitute(java.time.LocalDate.class,
				// java.sql.Date.class)
				// .directModelSubstitute(java.time.ZonedDateTime.class,
				// Date.class)
				// .directModelSubstitute(java.time.LocalDateTime.class,
				// Date.class)
				.select()
				.apis(RequestHandlerSelectors.any())
				//.apis(RequestHandlerSelectors.basePackage("com.youda.service.mobile.controller"))
				.paths(PathSelectors.any())
				.build();
				//.paths(regex(DEFAULT_INCLUDE_PATTERN))

		return docket;
	}

	private ApiInfo ApiInfo() {
		Contact contact = new Contact("", "", ""); // 作者、网站、邮箱
		ApiInfo apiInfo = new ApiInfo("", // 大标题
				"", // 小标题
				"1.0", // 版本
				"Youda", contact, // 作者
				"", // 链接显示文字
				""// 网站链接
		);
		return apiInfo;
	}
}