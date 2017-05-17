package com.corejava;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
 
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation{
     
    String key();
    String value();
    
    /** For default value */
   // String key() default "site";
  //  String value() default "java2novice.com";
}
 
public class AnnotationTestWithReflection {
 
    @MyAnnotation(key="site", value="java2novice.com")
    public void myAnnotationTestMethod(){
         
        try {
            Class<? extends AnnotationTestWithReflection> cls = this.getClass();
            Method mth = cls.getMethod("myAnnotationTestMethod");
            MyAnnotation myAnno = mth.getAnnotation(MyAnnotation.class);
            System.out.println("key: "+myAnno.key());
            System.out.println("value: "+myAnno.value());
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
     
    public static void main(String a[]){
         
    	AnnotationTestWithReflection mat = new AnnotationTestWithReflection();
        mat.myAnnotationTestMethod();
    }
}

