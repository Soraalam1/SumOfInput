import java.util.Scanner;

public class Main {
    public static void SumOfNumbers()
    {
        System.out.println("Please input a number to receive the sum of the numbers 1 to your number.");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        int Numbers[] = new int[userInput];
        int answer = 0;

        for(int index = userInput-1; index >= 0; index--)
        {
            Numbers[index] = userInput - index;
            answer += Numbers[index];
        }
        System.out.println("The sum of all the numbers leading up to that number is " + answer);
    }

    public static void main(String[] args){
        SumOfNumbers();
    }
}
