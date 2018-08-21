package com.thinktik.demo28.anno.demo03;

import java.lang.annotation.*;

@Documented
@Inherited
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Colors {
    Color[] value();
}
