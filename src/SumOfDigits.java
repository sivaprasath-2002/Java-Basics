import java.util.Scanner;

public class SumOfDigits {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = in.nextInt();
        System.out.println(sum(num));
    }

    static int sum(int num){
        int sum = 0;
        int x = num;
        while(x > 0){
            int temp = x %10;
            sum += temp ;
            x /= 10;
        }
        return sum;
    }
}
