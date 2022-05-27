package com.firebird.zhangkuispringstudy.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * 在类和接口上使用
 * 运行时候起作用
 * @Inherited 是表示如果父类使用类这个注解，子类即使没有明确指定，其实也使用了
 * @Repeatable 注解是为了解决一个类上不能使用同一个注解多次的问题
 * @Component 注解是将该注解的使用者转化成一个bean，交给spring进行的管理
 * 注意：
 * 在基础的注解中使用了那些元注解，在聚合的注解中就要使用那些元注解
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Repeatable(Reports.class)
@Component
public @interface Report {

    int type() default 0;

    String value() default "";
}

