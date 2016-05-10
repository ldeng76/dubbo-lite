package com.xyp260466.dubbo.annotation;
import java.lang.annotation.*;

/**
 * Created by xyp on 16-5-9.
 *
 * 用于指定DUBBO服务类
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Provider {
    String value() default "";
}
