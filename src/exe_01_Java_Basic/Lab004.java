package exe_01_Java_Basic;

public class Lab004 {
    public static void main(String[] args){
        array_practice();
        sum_array();
        Reverse_array();
        oddeven_count();
        Second_largest_number();
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
    public static void Reverse_array(){
        int[] arr = {1,2,3,4,5};
        for (int i = arr.length - 1; i >= 0; i--){
            System.out.println(arr[i] + "");
        }
    }
    public static void oddeven_count(){
        int[] num = {1,2,3,4,5,6,26,29,44};
        int even_count = 0;
        int odd_count = 0;
        for (int n : num){
            if (n % 2 ==0){
                even_count ++;
            }else {
                odd_count ++;
            }
        }
        System.out.println("even number count = " + even_count);
        System.out.println("Odd number count = " + odd_count);
    }
    public static void Second_largest_number(){
        int[] arr ={1,2,3,4,5,66,44,5,33,45};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int n : arr){
            if( n > first ){
                second = first;
                first = n;
            }
            else if (n > second && n != first){
                second = n;
            }
        }
        System.out.println("Second largest number = " + second);
    }
}
