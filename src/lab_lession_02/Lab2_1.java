package lab_lession_02;

import java.util.Scanner;

/*
Get input from user about height(m) and weight(kg) then calculate BMI
Underweight = <18.5
• Normal weight = 18.5 - 24.9
• Overweight = 25-29.9
• Obesity = BMI of 30 or greater
BMI - weight / (height )^2 | BMI formula
* */
public class Lab2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi nhap chieu cao (m): ");
        double height = scanner.nextDouble();
        System.out.print("Moi nhap can nang (kg): ");
        double weight = scanner.nextDouble();
        double bmi = weight / (height * height);
        bmi = Math.round(bmi * 100.0) / 100.0; // Lam tron 2 chu so thap phan
        if(bmi < 18.5){
            System.out.println("Tri so BMI cua ban la "+ bmi + " - Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9){
            System.out.println("Tri so BMI cua ban la "+ bmi + " - Normal weight");
        }else if (bmi >= 25 && bmi < 30){
            System.out.println("Tri so BMI cua ban la "+ bmi + " - Overweight");
        }else {
            System.out.println("Tri so BMI cua ban la "+ bmi + " - Obesity");
        }

    }
}
