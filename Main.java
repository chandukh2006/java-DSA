import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (isEven(number)) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}