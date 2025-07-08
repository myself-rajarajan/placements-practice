import java.util.Scanner;

public class array {
    public static void main(String[] args){
        System.out.println("create an integer array, get the input from user and print their sum.");

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array: ");
        int n = sc.nextInt();
        int[] num = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){                                                     //input from user
            System.out.print("enter the " + i + "st element of the array: ");
            num[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){                                                     //sum of array                                                     
            sum += num[i];
        }
        System.out.println("the sum of the array element is: " + sum); 
    }    
}
