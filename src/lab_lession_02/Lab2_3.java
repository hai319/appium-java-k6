package lab_lession_02;

import java.util.Scanner;
//Suggest user to increase/decrease weight

public class Lab2_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi nhap chieu cao (m): ");
        double height = scanner.nextDouble();
        System.out.print("Moi nhap can nang (kg): ");
        double weight = scanner.nextDouble();
        double bmi = weight / (height * height);

        bmi = Math.round(bmi * 100.0) / 100.0; // Lam tron 2 chu so thap phan
        double idealWeightMin ;
        double idealWeightMax ;
        double weightToGainMin;
        double weightToGainMax;
        double weightToLoseMin;
        double weightToLoseMax;

        idealWeightMin = 18.5 * (height * height);
        idealWeightMax = 24.9 * (height * height);
        idealWeightMin = Math.round(idealWeightMin * 100.0) / 100.0;
        idealWeightMax = Math.round(idealWeightMax * 100.0) / 100.0;

        weightToGainMin = idealWeightMin - weight;
        weightToGainMin = Math.round(weightToGainMin * 100.0) / 100.0;
        weightToGainMax = idealWeightMax - weight;
        weightToGainMax = Math.round(weightToGainMax * 100.0) / 100.0;

        weightToLoseMin = weight - idealWeightMin ;
        weightToLoseMin = Math.round(weightToLoseMin * 100.0) / 100.0;
        weightToLoseMax = weight - idealWeightMax ;
        weightToLoseMax = Math.round(weightToLoseMax * 100.0) / 100.0;

        if(bmi < 18.5){
            System.out.println("Tri so BMI cua ban la "+ bmi + " - Underweight");
            System.out.println("De dat duoc BMI binh thuong ban can tang can nang len tu "+ weightToGainMin + " den " + weightToGainMax + " kg");
        } else if (bmi >= 18.5 && bmi <= 24.9){
            System.out.println("Tri so BMI cua ban la "+ bmi + " - Normal weight");
        }else if (bmi >= 25 && bmi < 30){
            System.out.println("Tri so BMI cua ban la "+ bmi + " - Overweight");
            System.out.println("De dat duoc BMI binh thuong ban can giam can nang xuong tu "+ weightToLoseMax +" den "+ weightToLoseMin + " kg");
        }else {
            System.out.println("Tri so BMI cua ban la "+ bmi + " - Obesity");
            System.out.println("De dat duoc BMI binh thuong ban can giam can nang xuong tu "+ weightToLoseMax +" den "+ weightToLoseMin + " kg");
        }
    }
}
