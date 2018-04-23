package com.thinktik.demo28.anno;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface AnnotationDef {
    public String classExplanation();

    public String classMessage();
}
