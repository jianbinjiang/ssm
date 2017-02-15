package com.hk.integralMall.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by yangliangbin on 2016/10/13.
 * Swagger的Restfull Api配置-
 * 访问地址->http://localhost:8888/swagger-ui.html
 */
@Configuration
@EnableWebMvc
@EnableSwagger2
@ComponentScan(basePackages ={"com.hk.integralMall"})
public class SwaggerConfig {
    private final String BASE_PACKAGE_INTEGRAL = "com.hk.integralMall.controller.integral";
    private final String API_INFO_TITLE = "华康移动医疗-医客积分商城接口服务";
    private final String API_INFO_SERVICEURL = "http://www.hk515.com";
    private final String API_INFO_CONTACT = "华康移动医疗";
    private final String API_INFO_VERSION = "1.0";

    /**
     * 积分商城服务接口文档
     *
     * @return
     */
    @Bean
    public Docket his2hk() {
        return new Docket(DocumentationType.SWAGGER_2)
        		//配置跨域域名
        		//.host("twogoods.cc")
                .groupName("integralGroup")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage(BASE_PACKAGE_INTEGRAL))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 构造接口文档信息
     *
     * @return
     */
    @SuppressWarnings("deprecation")
	private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(API_INFO_TITLE)
                .termsOfServiceUrl(API_INFO_SERVICEURL)
                .contact(API_INFO_CONTACT)
                .version(API_INFO_VERSION)
                .build();
    }
}
