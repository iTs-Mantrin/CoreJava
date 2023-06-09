package JavaBasic;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = sc.nextInt();
        //123
        int reverse = 0;

        while(number != 0){
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        System.out.println("Reverse Number: " + reverse);
    }
}
