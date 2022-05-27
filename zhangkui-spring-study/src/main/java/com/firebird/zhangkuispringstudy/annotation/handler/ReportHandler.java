package com.firebird.zhangkuispringstudy.annotation.handler;

import com.firebird.zhangkuispringstudy.annotation.Report;
import com.firebird.zhangkuispringstudy.service.AnnotationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Service;

import java.lang.annotation.Annotation;

/**
 * 注解的实质也是一个类，所以要获取这个注解的信息也会使用到反射API
 *
 */
@Slf4j
@Service
public class ReportHandler {

    /**
     * 获取注解信息可以使用AnnotationUtils.getAnnotation();
     * 第一个参数是使用这个注解的类，第二个参数是使用的注解
     * 问题来了，很多地方都用了这个注解，如果这样获取的话，完全就是傻子行为，业务加一个使用该注解的地方，这里就要加一个。
     * 怎么解决
     */
    public void handleReport(){
        log.info("report 注解的处理类");
//        Report report = AnnotationUtils.getAnnotation(AnnotationService.class, Report.class);
        AnnotationService.class.isAnnotationPresent(Report.class); // 判断AnnotationService 是否使用了Report注解 【如果是方法或者构造函数，都用他们对应的反射类进行判断】

        Report report = AnnotationService.class.getAnnotation(Report.class); // 获取AnnotationService 使用的Report注解的具体数据
        log.info("type is : {}" , report.type() );

    }
}
