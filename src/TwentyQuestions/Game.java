// Owen Compher
// part of my 20 Questions project
// 9-24-2020
// base on code from https://www.edureka.co/blog/java-binary-tree

package TwentyQuestions;

import java.util.Scanner;

public class Game {
    public static class QuestionTree {
        static class Question {
            String text;                                         // the text to display for that question
            Question yes, no;                                    // these properties contain the sub-questions
            Boolean finalAnswer;                                 // whether the question is a final guess

            Question(String text, Boolean isFinal) {             // constructor
                this.text = text;
                yes = null;                                      // sub-questions start out empty
                no = null;
                finalAnswer = isFinal;
            }
        }
        public Question add(Question parent, String answer, String text, Boolean isFinal) {
            if (answer.startsWith("yes")) {
                parent.yes = new Question(text, isFinal);        // creates the sub-question of the parent
                return parent.yes;                               // returns the new question, so it can be set to a variable
            } else {
                parent.no = new Question(text, isFinal);
                return parent.no;
            }
        }
    }
    public static void play(QuestionTree.Question root) {        // game starts with the first (root) question
        Scanner scan = new Scanner(System.in);                   // creates the scanner

        boolean done = false;
        QuestionTree.Question currentQuestion = root;

        while (!done) {                                          // until the question is a final guess:
            System.out.println(currentQuestion.text);            //  | displays the current question's text
            if (currentQuestion.finalAnswer) {                   //  | when the question is a final guess:
                if (scan.next().contains("y")) System.out.println("Yay, I win!");
                else System.out.println("Aww, I guess you win!");
                done = true;                                     //  |  | ends the game
            }
            else {
                if (scan.next().contains("y")) {
                    currentQuestion = currentQuestion.yes;       //  | moves on to the relevant sub-question
                } else currentQuestion = currentQuestion.no;
            }
        }
    }
}
