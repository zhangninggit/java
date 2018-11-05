package Thread;


//线程Demo
public class C {
    public static void main(String[] args) { //main是函数的主线程
        A x = new A();
        B y = new B();
        x.start(); //线程加入到内存中排队
        y.start();
    }
}
