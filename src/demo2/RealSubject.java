package demo2;

public class RealSubject implements Subject {
    public static RealSubject getInstance() {
        return new RealSubject();
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
