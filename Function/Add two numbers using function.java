import java.util.Scanner;
import java.util.*;
class Add_two_Numbers{
    public static int Add_Two(int num1, int num2){
        int sum = num1 + num2;
        return sum;
        
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int sum = Add_Two(num1, num2);
        System.out.println(sum);

    }

    
}
