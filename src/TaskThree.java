import java.util.Scanner;

/**
 Написать свой вариант ф-и Arrays.toString() для int[]
 */
public class TaskThree {
    public static String intToString(int[] intarray){
        StringBuilder tempstring = new StringBuilder();
        tempstring.append('[');
        for (int i = 0; i < intarray.length; i++){
            tempstring.append(intarray[i] + ", ");
        }
        tempstring.delete(tempstring.length() - 2, tempstring.length());
        tempstring.append(']');
        return tempstring.toString();
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("State the array size: ");
        int[] intarray = RandIntArr.arrayRand(scan.nextInt(), 100);
        scan.close();
        System.out.print("Generated array: " + intToString(intarray));
    }
}
