package com.firebird.zhangkuispringstudy.annotation;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Reports {
    Report[] value();
}
