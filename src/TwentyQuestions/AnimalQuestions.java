// Owen Compher
// part of my 20 Questions project
// 9-24-2020

package TwentyQuestions;

public class AnimalQuestions {
    public static void main(String[] args) {
        Game.QuestionTree animal = new Game.QuestionTree();
        Game.QuestionTree.Question mammal = new Game.QuestionTree.Question("Is it a mammal?", false);
        Game.QuestionTree.Question pet = animal.add(mammal, "yes", "Is it a pet?", false);
        Game.QuestionTree.Question reptile = animal.add(mammal, "no", "Is it a reptile?", false);
        Game.QuestionTree.Question bark = animal.add(pet, "yes", "Does it bark?", false);
        Game.QuestionTree.Question legs = animal.add(reptile, "yes", "Does it have legs?", false);
        animal.add(reptile,"no", "Its a bird!", true);
        animal.add(legs,"yes", "Its a turtle!", true);
        animal.add(legs, "no", "Its' a snake!", true);
        animal.add(pet, "no", "Its an elephant!", true);
        animal.add(bark, "yes", "Its a dog!", true);
        animal.add(bark, "no", "Its a cat!", true);

        Game.play(mammal);
    }
}


