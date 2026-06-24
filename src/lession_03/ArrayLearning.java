package lession_03;

public class ArrayLearning {
    public static void main(String[] args) {
        int[] intArray = new int[5];
        for(int i = 0; i < intArray.length; i++ ){
            intArray[i] = i+1;
        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
     }
}
