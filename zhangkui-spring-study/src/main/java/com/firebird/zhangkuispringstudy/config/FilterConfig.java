package com.firebird.zhangkuispringstudy.config;

import com.firebird.zhangkuispringstudy.service.NameFilterService;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤器的配置类
 *
 */
@Configuration
public class FilterConfig {

    /**
     * 定义一个bean。这个bean是在系统中被调用的
     * @return
     */
    @Bean
    public FilterRegistrationBean registerFilter(){
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        //这里把要过滤的对象加入
        registrationBean.setFilter(new NameFilterService());
        registrationBean.setUrlPatterns(urlPatterns());
        registrationBean.setName("NameFilterService");
        registrationBean.setOrder(1);
        return registrationBean;
    }

    /**
     * 获取urlPatterns 列表 【URL匹配列表】
     * @return
     */
    private List<String> urlPatterns(){
        List<String> patternsList = new ArrayList<>();
        patternsList.add("/filter/name");

        return patternsList;
    }
}
