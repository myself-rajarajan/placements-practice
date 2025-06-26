import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //input to get as a string
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        

        //input to get as an integer
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        
        //output 
        System.out.println("Hello " + name);
        System.out.println("you are " + age + " years old.");
    }
}
