void main() {
    Scanner in = new Scanner(System.in);
    IO.print("Enter a Number: ");
    int num = in.nextInt();
    oddOrEven(num);
}

static void oddOrEven(int num) {
    if (num % 2 == 0) {
        IO.println(num + " is an Even number. ");
    } else {
        IO.println(num + " is an Odd number. ");
    }
}
