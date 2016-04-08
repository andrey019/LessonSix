import java.util.Calendar;
import java.util.Scanner;

/**
 Ввести с консоли дату. Сравнить ее с текущей датой в
 системе. Вывести отличающиеся части (год, месяц) на
 экран
 */
public class TaskOne {
    private static int[] enterDate(){
        int[] result = new int[3];
        int year, month, day;
        boolean check;
        Scanner scan = new Scanner(System.in);

        System.out.print("State the year: ");
        do {
            year = scan.nextInt();
            if ( (year > -1) && (year < 2017) ){
                check = false;
            } else {
                check = true;
                System.out.print("Wrong! Try again: ");
            }
        } while (check);
        result[0] = year;

        System.out.print("State the month (by number): ");
        do {
            month = scan.nextInt();
            if ( (month > 0) && (month < 13) ){
                check = false;
            } else {
                check = true;
                System.out.print("Wrong! Try again: ");
            }
        } while (check);
        result[1] = month;

        System.out.print("State the day (by number): ");
        do {
            day = scan.nextInt();
            if ( (day > 0) && (day < 32) ){
                check = false;
            } else {
                check = true;
                System.out.print("Wrong! Try again: ");
            }
        } while (check);
        result[2] = day;
        scan.close();
        return result;
    }

    public static void main(String[] args){
        Calendar calendar = Calendar.getInstance();
        int[] entdate = enterDate();
        boolean check = false;
        int year = calendar.get(Calendar.YEAR), month = calendar.get(Calendar.MONTH) + 1,
            day = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println("Entered date: " + entdate[2] + "/" + entdate[1] + "/" + entdate[0]);
        System.out.println("Current date : " + day + "/" + month + "/" + year);

        if ( (entdate[0] != year) || (entdate[1] != month) || (entdate[2] != day) ){
            System.out.print("Mismatches: ");
            if (entdate[2] != day){
                System.out.print("day '" + entdate[2] + "'");
                check = true;
            }
            if ( (entdate[1] != month) && check ){
                System.out.print(", month '" + entdate[1] + "'");
            } else if (entdate[1] != month){
                System.out.print("month '" + entdate[1] + "'");
                check = true;
            }
            if ( (entdate[0] != year) && check){
                System.out.print(", year '" + entdate[0] + "'");
            } else if (entdate[0] != year){
                System.out.print("year '" + entdate[0] + "'");
            }
        } else {
            System.out.print("No mismatches");
        }
    }
}
