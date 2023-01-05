//package com.example.stock.service;
//
//import org.springframework.core.annotation.AliasFor;
//
//import java.lang.annotation.ElementType;
//import java.lang.annotation.Target;
//
///**
// * @author : nakgyeom
// * @date : 2023-01-05 오전 8:45
// */
//@Target({ElementType.METHOD, ElementType.TYPE})
//public @interface AliasForTest {
//
//    //메타 어노테이션의 메서드를 재정의 -> 메타 어노테이션이란: 어노테이션을 선언할 때 사용하는 어노테이션
//    @AliasFor(annotation = RequestMapping.class, attribute = "method")
//    RequestMethod[] action() default {};
//
//    // 어노테이션 내의 암시적 별칭
//    @AliasFor(annotation = RequestMapping.class, attribute = "path")
//    String[] value() default {};
//
//    @AliasFor(annotation = RequestMapping.class, attribute = "path")
//    String[] route() default {};
//}
