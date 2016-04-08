import java.util.Scanner;

/**
 Ввести с консоли число в бинарном формате. Перевести
 его в int и вывести на экран (“10” -> 2)
 */
public class TaskFive {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the binary number: ");
        String binum = scan.nextLine();
        scan.close();
        System.out.print("Result: " + Integer.parseInt(binum, 2));
    }
}
