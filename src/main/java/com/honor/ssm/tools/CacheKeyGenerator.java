package com.honor.ssm.tools;

import org.springframework.cache.interceptor.KeyGenerator;

import java.lang.reflect.Method;

public class CacheKeyGenerator  implements KeyGenerator {
    @Override
    public Object generate(Object o, Method method, Object... objects) {
        // This will generate a unique key of the class name, the method name
        //and all method parameters appended.
        StringBuilder sb = new StringBuilder();
        sb.append(o.getClass().getName());
        sb.append(method.getName());
        for (Object obj : objects) {
            sb.append(obj.toString());
        }
        System.out.println("keyGenerator=" + sb.toString());
        return sb.toString();
    }
}
