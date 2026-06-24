package lession_03;

import java.security.SecureRandom;
import java.util.Scanner;

public class Whileloop {
    public static void main(String[] args) {

        int inputNumber;
        final int luckyNumber = new SecureRandom().nextInt(6);
        int numberAnswerTime = 0;
        boolean isAnswerCorrect = false;
        int MAX_ANSWER_TIME = 3;
         while (!isAnswerCorrect && numberAnswerTime < MAX_ANSWER_TIME){
             Scanner scanner = new Scanner(System.in);
             System.out.print("Input number: ");
             inputNumber = scanner.nextInt();
             if (inputNumber == luckyNumber){
                 System.out.println("Congrast...");
                 isAnswerCorrect = true;
             }else {
                 numberAnswerTime++;
             }
         }
         if (numberAnswerTime == MAX_ANSWER_TIME){
             System.out.println("Goodluck");
         }
    }
}
