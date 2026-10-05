import java.util.Scanner;

class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("No. is Even");
        } else {
            System.out.println("No. is Odd");
        }
        sc.close();
    }
}