package com.production.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import springfox.documentation.swagger2.annotations.EnableSwagger2WebFlux;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2WebMvc
public class SwaggerConfig {
	
	@Bean
	public Docket postsApi() {

	return new Docket(DocumentationType.SWAGGER_2).groupName("production").apiInfo(apiInfo()).select()

	.paths(regex("/.*")).build();

	}



	private ApiInfo apiInfo() {

	return new ApiInfoBuilder().title("Course API")

	.description("xadmin Course API Documentation Generateed Using SWAGGER2 for our Course Rest API")

	.termsOfServiceUrl("https://www.youtube.com/channel/UC-85Tmx8lhNZQmBNbxZiqkw")

	.license("Xadmin Rest API License")

	.licenseUrl("https://www.youtube.com/channel/UC-85Tmx8lhNZQmBNbxZiqkw").version("1.0").build();

	}


}