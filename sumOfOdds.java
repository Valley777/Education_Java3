import java.util.Scanner;
public class sumOfOdds {
    public static void main(String[] args) {
    /*
    Sum of Odd Numbers
    Write a program that prints the next n odd numbers (starting from 1) and on the last row prints the sum of them.
    Input > On the first line, you will receive a number – n. This number shows how many odd numbers you should print.
    Output > Print the next n odd numbers, starting from 1, separated by new lines.
    On the last line, print the sum of these numbers.
    */
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        for (int i=1; i<=n*2; i++){
            if(i%2!=0){
                System.out.println(i);
                sum+=i;
            }
        }
        System.out.printf("Sum: %d",sum);
    }
}
