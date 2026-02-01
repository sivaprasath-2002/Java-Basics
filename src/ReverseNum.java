import java.util.Scanner;

public class ReverseNum {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = in.nextInt();
        System.out.println(reverse(num));
    }

    static int reverse(int num){
        int rev = 0;
        int x = num;
        while(x > 0){
            int temp = x %10;
            rev = rev *10 + temp ;
            x /= 10;
        }
        return rev;
    }
}
