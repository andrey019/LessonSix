import java.util.Scanner;

/**
 Написать код, который позволит менять и читать значения
 произвольных битов в массиве int-ов
 */
public class TaskFour {
    private static int bitChange(int inputint, int position){
        position--;
        if ((inputint & (1 << position)) == 0){
            inputint = inputint | (1 << position);
        } else {
            inputint = inputint & ~(1 << position);
        }
        return inputint;
    }

    private static String toBinaryString(int inputint){
        return String.format("%32s", Integer.toBinaryString(inputint)).replace(' ', '0');
    }

    public static void main(String[] args){
        int numposition, bitposition;
        Scanner scan = new Scanner(System.in);

        System.out.print("State the array size: ");
        int[] intarray = RandIntArr.arrayRand(scan.nextInt(), 128);
        System.out.println("Generated array: " + TaskThree.intToString(intarray));

        System.out.print("Choose the position of the number you're want to change (starting from 1): ");
        numposition = scan.nextInt() - 1;

        System.out.println("You've chosen number '" + intarray[numposition] + "' and it's binary representation is '" +
                           toBinaryString(intarray[numposition]));
        System.out.print("Choose the bit you're want to change (starting from 1, from right to left): ");
        bitposition = scan.nextInt();
        scan.close();

        int result = bitChange(intarray[numposition], bitposition);
        intarray[numposition] = result;
        System.out.print("Resulted number is '" + result + "', it's binary representation is '" +
                         toBinaryString(result) + "' and resulted array is " + TaskThree.intToString(intarray));

    }
}
