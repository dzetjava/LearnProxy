package demo2;

public class Client {
    public static void main(String[] args) {
        Subject subject = SubjectProxy.getProxy(RealSubject.getInstance());
        subject.rent();
        subject.hello(" world !!!");
    }

}
