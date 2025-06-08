package exe_01_Java_Basic;
import java.util.Scanner;

public class Lab003_ArithmeticOps {
    public static void main(String[] args){
    arithmetic_operations();
    comparisonOperators();
    logicalCheck();
    incrementDemo();
    Switch_Demo();
    //Grade_cal();
    No_condition();
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
    public static void Switch_Demo(){
        int day = 0;
        switch (day){
            case 1:
                System.out.println("day 1");
                break;
            case 2:
                System.out.println("Day 2");
                break;
            case 3:
                System.out.println("Day 3");
                break;
            case 4:
                System.out.println("Day 4");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
    public static void Grade_cal(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your mark: ");
        int mark = scanner.nextInt();

        if (mark >= 90){
            System.out.println("A+");
        } else if (mark >= 80 ) {
            System.out.println("A");
        } else if (mark >= 70 ) {
            System.out.println("B+");
        } else if (mark >= 60 ) {
            System.out.println("B");
        } else if (mark >= 50 ) {
            System.out.println("C+");
        } else if (mark >= 40 ) {
            System.out.println("c");
        } else{
            System.out.println("Failed");
        }
    }
    public static void No_condition(){
        int n = 9;
        String[] res = {"even","odd"};
        System.out.println(res[n % 2]);
    }
}
