package com.thinktik.demo28.anno;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface AnnoattionDef02 {
    String explanation();

    String message();
}
