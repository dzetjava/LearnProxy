package demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理
 */
public class DynamicProxy implements InvocationHandler {

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
    public DynamicProxy(Object subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 在代理真实对象之前我们可以添加一些自己的操作
        System.out.println("-------------------------before rent house ");
        System.out.println("-------------------------method:" + method);
        // 当代理对象调用真实对象的方法时，其会自动的跳转到代理对象关联的handler对象的invoke方法进行调用
        method.invoke(subject, args);
        // 在代理真实对象之后我们可以添加自己的操作
        System.out.println("-------------------------after rent house ");
        return null;
    }
}
