package com.groovy.firstday

import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

/**
 * Created with IntelliJ IDEA.
 * User: Alex
 * Date: 22.05.2014
 * Time: 10:18
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface IncludeTostring {
String toString();
}