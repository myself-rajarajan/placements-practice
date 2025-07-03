import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] strarr = input.split("[:]");
        // Now let us convert the String Array to a int Array
        int[] numbers = new int[strarr.length];
        int arrayPosition = 0;
        for (String str : strarr){
            numbers[arrayPosition++] = Integer.parseInt(str);
        }
        // Now sort the int Array
        Arrays.sort(numbers);

        // Print the sorted numbers
        for (int num : numbers){
            System.out.println(num);
        }
    }
}