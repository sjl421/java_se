package com.thinktik.demo28.anno;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface AnnotationDef {
    String classExplanation();

    String classMessage();
}
