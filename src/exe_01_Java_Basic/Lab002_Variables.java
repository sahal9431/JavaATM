package exe_01_Java_Basic;

public class Lab002_Variables {
    public static void main(String[] args){
        int age = 27;
        double weight = 94.45;
        String place = "Thrissur";
        String name = "sahal";
        char grade = 'A';
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Weight = " + weight);
        System.out.println("Place " + place);
        System.out.println("Grade " + grade);


        int num = 100;
        double d = num; // Implicit casting
        System.out.println("double = " + d);

        double b = 101.101;
        int abc = (int) b; // Explicit casting
        System.out.println("Int = " + abc);


        float radius = 25.25f;
        float area = 3.14f * radius * radius;
        System.out.println("Area = " + area);

        int x = 2 , y = 3;
        System.out.println("Before " + x + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("After " + x + y);
        System.out.println("END");
    }
}

