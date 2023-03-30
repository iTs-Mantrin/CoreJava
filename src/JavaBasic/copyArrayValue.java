package JavaBasic;

import java.util.Scanner;

public class copyArrayValue {

    public static void main(String main[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < arr.length; i++ )
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Copying number in Array 2");

        int[] arr2 = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            arr2[i] = arr[i];
        }

        System.out.println("Displaying array elements");
        for(int i = 0; i< arr2.length; i++){
            System.out.println(arr2[i]);
        }

    }
}
