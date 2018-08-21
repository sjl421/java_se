package com.thinktik.demo28.anno.demo03;

import java.lang.annotation.*;

@Documented
@Inherited
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Colors.class)
public @interface Color {
    enum Type{BlUE, GREEN, RED};

    Type value() default Type.RED;
}
