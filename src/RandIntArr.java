import java.util.Random;

/**
 * Created by andrey on 17.03.16.
 */

public class RandIntArr {
    public static int[] arrayRand (int arrsize){
        Random rand = new Random();
        int[] inarr = new int[arrsize];
        for (int i = 0; i < arrsize; i++){
            inarr[i]=rand.nextInt(200)-100;
        }
        return inarr;
    }

    public static int[] arrayRand (int arrsize, int highrand){
        Random rand = new Random();
        int[] inarr = new int[arrsize];
        for (int i = 0; i < arrsize; i++){
            inarr[i]=rand.nextInt(highrand);
        }
        return inarr;
    }

    public static int[] arrayRand (int arrsize, int highrand, int lowrand){
        Random rand = new Random();
        int[] inarr = new int[arrsize];
        for (int i = 0; i < arrsize; i++){
            inarr[i]=rand.nextInt(highrand)-lowrand;
        }
        return inarr;
    }
}
