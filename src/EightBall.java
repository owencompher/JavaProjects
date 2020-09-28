// Owen Compher
// Eight Ball project
// 9-24-2020

import java.util.Scanner;

public class EightBall {
    public static void main(String[] args) {
        String[] responses = {  // all the responses the 8-ball could give
                "yes, 100%",
                "possibly",
                "nope",
                "probably",
                "if you're lucky",
                "in your dreams",
                "no, never, not at all",
                "very unlikely"
        };
        Scanner scan = new Scanner(System.in);                    // creates the scanner
        System.out.println("Ask me something: ");                 // asks for input
        scan.next();                                              // scans (doesn't actually do anything with it)
        System.out.println(responses[(int)(Math.random()*8)]);    // prints a random item from list of responses
    }
}
