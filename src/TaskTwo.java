import java.util.Arrays;

/**
 Написать свой вариант ф-и Arrays.equals для short[]
 */
public class TaskTwo {
    private static boolean shortEqual(short[] firstarray, short[] secondarray){
        if (firstarray.length == secondarray.length){
            for (int i = 0; i < firstarray.length; i++){
                if (firstarray[i] != secondarray[i]){
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args){
        short[] good1 = {5,5,5}, good2 = {5,5,5}, bad1 = {5,1,5}, bad2 = {5,5,5,5};
        System.out.println("Comparing " + Arrays.toString(good1) + " and " + Arrays.toString(good2) + ". Result: " +
                           shortEqual(good1, good2));
        System.out.println("Comparing " + Arrays.toString(good1) + " and " + Arrays.toString(bad1) + ". Result: " +
                shortEqual(good1, bad1));
        System.out.println("Comparing " + Arrays.toString(good1) + " and " + Arrays.toString(bad2) + ". Result: " +
                shortEqual(good1, bad2));
    }
}
