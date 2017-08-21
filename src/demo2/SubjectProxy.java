package demo2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class SubjectProxy extends AbsDynamicProxy {

    public static Subject getProxy(Subject subject) {
        InvocationHandler handler = new SubjectProxy(subject);
        return (Subject) Proxy.newProxyInstance(
                handler.getClass().getClassLoader(), subject.getClass().getInterfaces(), handler);
    }

    public SubjectProxy(Object subject) {
        super(subject);
    }

    @Override
    protected void afterAction() {
        System.out.println("==after==");
    }

    @Override
    protected void beforeAction() {
        System.out.println("==before==");
    }
}
