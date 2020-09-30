// Tests if 1, 2, 3, or 4 is a factor of a random number from 1 to 100

import java.util.Scanner;

public class Project3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int random = (int) (Math.random()*101);
        System.out.println("Integer between 1 and 4:");
        int factor = sc.nextInt();
        if (random % factor == 0) System.out.println(factor + " IS a factor of " + random);
        else System.out.println(factor + " IS NOT a factor of " + random);
    }
}
