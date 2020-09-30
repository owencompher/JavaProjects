// Creates and plays a 20 questions game

package TwentyQuestions;

public class AnimalQuestions {
    public static void main(String[] args) {
        QuestionsGame.QuestionTree animal = new QuestionsGame.QuestionTree();
        QuestionsGame.QuestionTree.Question mammal = new QuestionsGame.QuestionTree.Question("Is it a mammal?", false);
        QuestionsGame.QuestionTree.Question pet = animal.add(mammal, "yes", "Is it a pet?", false);
        QuestionsGame.QuestionTree.Question reptile = animal.add(mammal, "no", "Is it a reptile?", false);
        QuestionsGame.QuestionTree.Question bark = animal.add(pet, "yes", "Does it bark?", false);
        QuestionsGame.QuestionTree.Question legs = animal.add(reptile, "yes", "Does it have legs?", false);
        animal.add(reptile,"no", "Its a bird!", true);
        animal.add(legs,"yes", "Its a turtle!", true);
        animal.add(legs, "no", "Its' a snake!", true);
        animal.add(pet, "no", "Its an elephant!", true);
        animal.add(bark, "yes", "Its a dog!", true);
        animal.add(bark, "no", "Its a cat!", true);

        QuestionsGame.play(mammal);
    }
}


