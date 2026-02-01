import java.util.Scanner;
public class Odd_Even {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = in.nextInt();
        oddOrEven(num);
    }

    static void oddOrEven(int num){
        if (num % 2 == 0){
            System.out.println(num + " is an Even number. ");
        }
        else{
            System.out.println(num+ " is an Odd number. ");
        }
    }
}
