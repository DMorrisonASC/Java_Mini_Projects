/* Author: Daeshaun Morrison, Muhlenberg College class of 2024(daeshaunkmorrison@gmail.com)
 Date: 3/9/2021
 Instructor: Professor Hellsing
 Description:
*/
import java.util.Arrays;
public class Sorted {
    public static void main(String[] args) {
        char[] lettersToBeSorted = { 'b', 'f', 'a', 'z', 'm', 'g' };

        int numberOfIterations = sortLexiCon(lettersToBeSorted);

        System.out.println("The newly sorted array is: " + Arrays.toString(lettersToBeSorted) + "\n" +
                "It toke " + numberOfIterations + " iterations!");

    }

    public static int sortLexiCon(char[] toBeSorted) {
        int numOfIterations = 0;

        for(int i=0; i < toBeSorted.length; i++) {
            for(int j=0; j < toBeSorted.length; j++) {
                if(toBeSorted[j] > toBeSorted[i]) {
                    char temp = toBeSorted[i];
                    toBeSorted[i] = toBeSorted[j];
                    toBeSorted[j] = temp;

                    for (int k = 0; k < toBeSorted.length; k++) {
                        System.out.print(toBeSorted[k]);
                    }
                    numOfIterations++;
                    System.out.println();
                }
            }
        }
        return numOfIterations;
    }
}
