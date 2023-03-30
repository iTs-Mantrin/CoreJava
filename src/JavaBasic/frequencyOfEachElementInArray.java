package JavaBasic;

import java.util.Scanner;

public class frequencyOfEachElementInArray {
    public  static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int[] fr  = new int[arr.length];
        int visited = -1;
        System.out.println("Enter the elements");
        for (int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            int count  = 1;
            for( int j = i+1; j< arr.length; j++ ){
                if(arr[i]==arr[j]){
                    count++;
                    fr[j] = -1;

                }

            }
        }
    }
}
