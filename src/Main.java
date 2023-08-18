import java.util.Scanner;

public class Main{
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);

     System.out.print("Number: ");

     int guess = scanner.nextInt();

     //Check if number is divisible by both 3 & 5
     if(guess % 3 == 0 && guess % 5 == 0){
            System.out.println("FizzBuzz");
        }
     //Check if number is devisible by 3
     else if (guess % 3 == 0){
         System.out.println("Fizz");
     }

     //Check if number is devisible by 5
     else if(guess % 5 == 0){
         System.out.println("Buzz");
     }

     else{
         System.out.println(guess);
     }
    }
}