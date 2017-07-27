/**
 * Created by 민우 on 2017-07-13.
 */
public class AverageFinder {
    double computeAverage(int[] intArray) {
        double average=0;
        double sum=0;
        for (int i=0; i<intArray.length; i++){
            sum+=intArray[i];
            average=sum/intArray.length;
        }
        return average;
    }
}