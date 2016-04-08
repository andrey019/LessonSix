import java.util.Scanner;

/**
 Ввести с консоли целое число. Посчитать количество
 единиц в его бинарном представлении (“1011” –> 3)
 */
public class TaskSix {
    private static int numberOfOnes(int input){
        int result = 0;
        String strinput = Integer.toString(input, 2);
        for (int i = 0; i < strinput.length(); i++){
            if (strinput.charAt(i) == '1'){
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scan.nextInt();
        System.out.print("Binary representation of the entered number is '" + Integer.toBinaryString(number) +
                         "' and the digit '1' is mentioned for " + numberOfOnes(number) + " times");
    }
}
