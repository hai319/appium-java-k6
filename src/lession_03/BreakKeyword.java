package lession_03;

public class BreakKeyword {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5};
        for (int elementIndex = 0; elementIndex < intArray.length; elementIndex++) {
            System.out.println(intArray[elementIndex]);
            if (intArray[elementIndex] == 3){
                System.out.println("So 3 dang o vi tri index "+ elementIndex);
                break;
            }
        }
    }
}
