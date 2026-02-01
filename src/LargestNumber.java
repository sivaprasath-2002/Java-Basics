import java.util.Scanner;

public class LargestNumber {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        largestNumber(a,b,c);
    }

     static void largestNumber(int a, int b, int c) {
        if (a>b){
            if (a>c){
                System.out.println(a + " is greater than b and c");
            }
        }
        else if(b>a){
            if (b>c){
                System.out.println(b + " is greater than a and c");
            }
            else {
                System.out.println(c + " is greater than a and b");
            }
        }
    }
}
