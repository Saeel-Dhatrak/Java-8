package lambdaExpressionUsage;

public class Main{
    public static void main(String[] args) {
        Employee employee = () -> "Software Engineer";
        System.out.println(employee.getName());


        // By this we way we don't have to create another implementation class if there is any other type of employee

        Employee employee1 = () -> "Developer";
        System.out.println(employee1.getName());
    }
}
