
import java.util.Scanner;

public class Adventure {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\n You are on an island surrounded by water.\n There is a path to the" +
                           " woods to the north, the sea to the south, and a beach shack to the east. " +
                           "\n Which way do you want to go (n,e,s,w)?");
        String command = scan.nextLine();
        switch (command) {
            case "n":
                System.out.println("You enter the forest and hear some rustling. \nThere may be tigers here" +
                                   " or maybe it's just monkeys.");
                break;
            case "s":
                break;
            case "e":
                break;
            case "w":
                break;
        }
    }
}
