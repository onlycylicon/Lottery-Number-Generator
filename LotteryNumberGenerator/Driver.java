

import java.util.Arrays;
import java.util.Random;
public class Driver {
    public static void main(String[] args) {
        Random rand = new Random();
        int min= 1, max = 90, slots = 6;
        int[] lotteryArray = new int[slots];
        boolean isRepeated;
        int randomNumber = 0;
        for (int indexDrawn = 0; indexDrawn < slots; indexDrawn++){
            do {
                 isRepeated = false;
                randomNumber = rand.nextInt(max + 1 - min) + min;
                for (int k = 0; k <= indexDrawn; k++){
                    if (lotteryArray[k] == randomNumber) {
                        isRepeated= true;
                        break;
                    }
                }
            } while (isRepeated);
            lotteryArray[indexDrawn] = randomNumber;
        }
        Arrays.sort(lotteryArray);
        System.out.println("The Draw for today is : ");
        for (int i = 0; i < slots; i++){
            System.out.print(lotteryArray[i] + " " );
        }
    }
}
