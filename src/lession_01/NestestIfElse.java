package lession_01;

public class NestestIfElse {
    public static void main(String[] args) {
        boolean isHeOnTime = false;
        boolean isHeAngry = true;
        System.out.println("chay toi quan");
        if (isHeOnTime){
            System.out.println("let's talk");
            if (isHeAngry) {
                System.out.println("Go Home");
            }
        }else {
            System.out.println("waiting a letter");
        }

    }
}
