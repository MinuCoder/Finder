/**
 * Created by 민우 on 2017-07-13.
 */
public class GreatestDifferenceFinder {
    //Math.abs()
    int greatestDifference(int[] intArray) {

        if (intArray.length<2){
            return 0;
        }
        else {
            int max = intArray[0];
            int min = intArray[0];

            for (int i = 0; i < intArray.length; i++) {
                // Max 값
                if (max < intArray[i]) {
                    max = intArray[i];
                }
                // Min 값
                if (min > intArray[i]) {
                    min = intArray[i];
                }
            }
            return max - min;
        }
    }
}