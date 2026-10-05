import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age < 0 || age > 120) {
            System.out.println("Invalid Age");
        } 
        else if (age >= 18) {
            System.out.println("You are eligible for voting");
        } 
        else {
            System.out.println("You are not eligible for voting");
        }
    }
}