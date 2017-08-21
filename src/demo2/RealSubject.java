package demo2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class RealSubject implements Subject {
    public static RealSubject getInstance() {
        return new RealSubject();
    }

    public static Subject getProxy(Subject subject) {
        InvocationHandler handler = new SubjectProxy(subject);
        return (Subject) Proxy.newProxyInstance(
                handler.getClass().getClassLoader(), subject.getClass().getInterfaces(), handler);
    }

    @Override
    public void rent() {
        System.out.println(" i want to rent my house ");
    }

    @Override
    public void hello(String str) {
        System.out.println("hello:" + str);
    }

}
