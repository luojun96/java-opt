package org.jun.reflect;

import sun.tools.tree.NewArrayExpression;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectOperator {
    public void run(){
        callNoArgsConstructor("org.jun.reflect.DemoBean");
        System.out.println(callStaticReturnArgsMethod("org.jun.reflect.DemoBean", "getA"));
    }

    public static Float callStaticReturnArgsMethod(String className, String methodName){
        Float result = null;
        Class bean = getReflectBean(className);
        Method m;
        try{
            m = bean.getMethod(methodName, new Class[]{float.class});
            result = (Float)m.invoke(methodName, 123);
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }

        return result;
    }

    public static void callNoArgsConstructor(String className) {
        try {
            Constructor c = getReflectBean(className).getConstructor();
            Object o = c.newInstance();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }

    public static Class getReflectBean(String className) {
        Class bean=null;
        try {
            bean = Class.forName(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return bean;
    }

}
