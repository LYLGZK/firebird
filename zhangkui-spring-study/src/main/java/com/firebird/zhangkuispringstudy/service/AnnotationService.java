package com.firebird.zhangkuispringstudy.service;

import com.firebird.zhangkuispringstudy.annotation.Report;
import com.firebird.zhangkuispringstudy.annotation.handler.ReportHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Report(type = 3, value = "test-3")
@Service
@Slf4j
public class AnnotationService {

    private final ReportHandler handler;

    public AnnotationService(ReportHandler handler) {
        this.handler = handler;
    }

    public String repeatable(){
        log.info("测试注解处理的service");
        handler.handleReport();
        return "ok";
    }
}
