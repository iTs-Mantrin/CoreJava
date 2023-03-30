package JavaBasic;

import java.util.Scanner;

public class reverseNumberRecursion {


   public static void reverseRecursion(int number){
    if(number<10){
        System.out.println(number);
        return;
    }
    else {
        System.out.print(number % 10);
        reverseRecursion(number/10);

    }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = sc.nextInt();
        reverseRecursion(number);

    }
}
