package io.github.cotide.dapper.core.attr;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 主键标识
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PrimaryKey {

    /**
     * 主键名
     * @return
     */
    String value() default "id";


    String sequenceName()  default  "";

    /**
     * 是否自增列
     * @return
     */
    boolean autoIncrement() default  false;
}
