package exe_01_Java_Basic;

public class Lab003_ArithmeticOps {
    public static void main(String[] args){
    arithmetic_operations();
    comparisonOperators();
    logicalCheck();
    incrementDemo();
    }
    public static  void arithmetic_operations(){
        int a = 10 , b = 2;
        System.out.println("a + b = " + (a+b));
        System.out.println("a - b = " + (a-b));
        System.out.println("a * b = " + (a*b));
        System.out.println("a / b = " + (a/b));
    }
    public static void comparisonOperators(){
        int a = 10 , b = 15;
        System.out.println("a == b : " + (a == b));
        System.out.println("a =! b : " + (a != b));
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
    }
    public static void logicalCheck(){
        int age = 18;
        boolean hasID = true;
        boolean isAdult = age <= 18 && hasID;
        System.out.println("Eligible for vote:" + isAdult);
    }
    public static void incrementDemo(){
        int a = 5;
        System.out.println("a++ = " + a++);
        System.out.println("+a = " + +a);
        System.out.println("++a = " + ++a);
    }
}
