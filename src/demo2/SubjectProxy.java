package demo2;

public class SubjectProxy extends AbsDynamicProxy {

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
