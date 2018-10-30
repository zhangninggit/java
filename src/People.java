public class People {

    void speak() {
        System.out.print("发言\n");
    }
}

class Student extends People{

    void prog(){
        System.out.print("学生编程\n");
    }

    void speak(){
        System.out.print("学生发言\n");
    }

    public static void main(String [] args){
        People xiaoming = new Student();
        //xiaoming这个引用默认调People类中的方法和变量，如果People类中的方法在继承类中被重写了，则调用重写方法
        //xiaoming这个引用调用Students类中的方法和变量时需强制类型转换
        ((Student) xiaoming).prog();

        xiaoming.speak();

    }
}

