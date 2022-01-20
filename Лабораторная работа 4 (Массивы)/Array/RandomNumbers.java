import java.util.Random;
public class Main{
        public static void main(String[] args) {
        	Random objGenerator = new Random();
            int[] array = new int [10];

            nt randomNumber;
            for (int iCount = 0; iCount< 10; iCount++){
              randomNumber = objGenerator.nextInt(100);
              array[iCount] = randomNumber;
             }
            array[0] = 1;
            for (int iCount = 9; iCount >= 0; iCount--){
                System.out.println(array[iCount] + " ");
            }

        }
}
