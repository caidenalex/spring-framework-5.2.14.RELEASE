package org.example.annotation;


import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME) /*作用范围*/
@Target({ElementType.FIELD ,ElementType.TYPE , ElementType.METHOD ,ElementType.PARAMETER}) /*作用域*/
@Inherited /*是否可被继承实现*/
@Documented /*是否文档展示*/
public @interface Autowired {
}
