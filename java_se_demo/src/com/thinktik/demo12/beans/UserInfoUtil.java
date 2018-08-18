package com.thinktik.demo12.beans;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class UserInfoUtil {
    public static void main(String[] args) {
        User user = new User();
        setProperty(user,"userName");
    }
    
    private static void setProperty(User user,String userName){
        try {
            PropertyDescriptor descriptor = new PropertyDescriptor(userName,User.class);
            Method method = descriptor.getWriteMethod();
            method.invoke(user,"think");
            System.out.println("Set username : "+user.getUserName());
        } catch (IntrospectionException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
