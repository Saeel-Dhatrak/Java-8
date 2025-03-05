package defaultMethodsExample;

public interface A {
    default void sayHello(){
        System.out.println("A says Hello!!!");
    }
}
