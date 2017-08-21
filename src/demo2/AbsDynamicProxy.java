package demo2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理
 */
public abstract class AbsDynamicProxy implements InvocationHandler {

    /**
     * 要代理的真实对象
     */
    private Object subject;

    /**
     * 构造方法，
     * 给要代理的真实对象赋值
     *
     * @param subject 传入真实对象
     */
    public AbsDynamicProxy(Object subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeAction();
        method.invoke(subject, args);
        afterAction();
        return null;
    }

    protected abstract void afterAction();

    protected abstract void beforeAction();
}
