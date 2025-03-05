package staticMethodsExample;

public class MyClass implements A{
    public static void main(String[] args) {
        MyClass mc = new MyClass();
        //mc.sayHello() // cannot call like this
        A.sayHello(); // only way to call static methods from interface is by using interface name
    }
}
