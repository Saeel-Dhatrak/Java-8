package defaultMethodsExample;

public interface B {
    default void sayHello(){
        System.out.println("B says Hello!!!");
    }
}
