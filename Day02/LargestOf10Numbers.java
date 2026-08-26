import java.util.Scanner;

public class LargestOf10Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, largest;

        System.out.print("Enter number 1: ");
        largest = sc.nextInt();

        for (int i = 2; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            num = sc.nextInt();

            if (num > largest) {
                largest = num;
            }
        }

        System.out.println("Largest number is: " + largest);

        sc.close();
    }
}