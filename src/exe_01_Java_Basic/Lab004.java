package exe_01_Java_Basic;

public class Lab004 {
    public static void main(String[] args){
        array_practice();
        sum_array();
    }
    public static void array_practice(){
        String[] names = {"sahal","Messi","Leo","Asif"};
        for (String name : names){
            System.out.println("Names = " + name);
        }
    }
    public static void sum_array(){
        int[] num = {1 , 2 , 3 ,4};
        int score = 0;
        for (int nums : num){
            score += nums;
            System.out.println("sum of numbers = " + score);
        }
        System.out.println("Final sum = " + score);
    }
}
