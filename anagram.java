import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word1: ");
        String word1 = sc.nextLine();

        System.out.print("Enter word2: ");
        String word2 = sc.nextLine();

        char[] arr1 = word1.toLowerCase().toCharArray();
        char[] arr2 = word2.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Both words are Anagrams");
        } else {
            System.out.println("Both words are Not Anagrams");
        }
    }
}