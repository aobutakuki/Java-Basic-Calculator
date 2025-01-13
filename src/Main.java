import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        boolean quit = false;

        while(!quit) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Calculator");

            System.out.println("[1] Add\n[2] Subtract\n[3] Multiply\n[4] Divide\n[5] Squared\n[6] SquareRoot\n[10] Quit");

            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    Add();
                    break;
                case 2:
                    Subtract();
                    break;
                case 3:
                    Multiply();
                    break;
                case 4:
                    Divide();
                    break;
                case 5:
                    Squared();
                    break;
                case 6:
                    SquareRoot();
                    break;
                case 10:
                     quit = true;
                     break;
                default:
                    break;

            }
        }
    }

    static void Add(){

        int a,b;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number");
        a = scanner.nextInt();

        System.out.println("Enter 2nd number");
        b = scanner.nextInt();

        System.out.println("Result: " + a + " + " + b + " = " + (a + b));


    }

    static void Subtract(){
        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number");
        a = scanner.nextInt();

        System.out.println("Enter 2nd number");
        b = scanner.nextInt();


        System.out.println("Result: " + a + " - " + b + " = " + (a - b));

    }

static void Multiply(){
        int a,b;
        Scanner scanner = new Scanner(System.in);
    System.out.println("Enter 1st number");
    a = scanner.nextInt();

    System.out.println("Enter 2nd number");
    b = scanner.nextInt();

    System.out.println("Result: " + a + " * " + b + " = " + (a * b));

}

static void Divide(){
      int a,b;
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter 1st number");
      a = scanner.nextInt();

      System.out.println("Enter 2nd number");
      b = scanner.nextInt();
      System.out.println("Result: " + a + " / " + b + " = " + (a / b));

}

static void Squared(){
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number");
        a = scanner.nextInt();

        System.out.println("The number " + a + " squared is: " + (a * a));
}

static void SquareRoot(){
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number");
        a = scanner.nextInt();

        if(a < 0)
        {
            System.out.println("Invalid number");
            return;
        }

    System.out.println("The square root of number " + a + " is: " + Math.sqrt(a));

}
}