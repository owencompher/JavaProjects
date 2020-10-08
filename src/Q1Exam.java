// Prints the minimum of 3 input values

import java.util.Scanner;

public class Q1Exam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        if (x != y && y != z && x != z) {
            int answer;
            if (x < y && x < z) {
                answer = x;
            } else if (y < x && y < z) {
                answer = y;
            } else {
                answer = z;
            }
            System.out.println("The minimum value is " + answer);
        } else {
            System.out.println("Values were not all different");
        }
    }
}
