package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {


    Scanner inputscanner1;

    public App() {
        inputscanner1 = new Scanner(System.in);
    }

    //todo Task 1
    public void sayHelloWorld(){
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
        // input your solution here
    }

    //todo Task 3
    public void sumOfLiterals(){

        int b = 0xface;
        int c = 012;
         char a = 'Z';
        int d = (int) 80L;
        int e = (int) 44e-1f;
        int f = (int) 5.5f;
        int g = (int) 8.88e1;
        int h = (int) 99.9;

        int sum = (a + b + c + d + e + f + g + h);

        System.out.println(sum);
        // input your solution here
    }

    //todo Task 4
    public void addTwoNumbers(){
        int a = inputscanner1.nextInt();
        int b = inputscanner1.nextInt();

        System.out.println(a + b);
        // input your solution here
    }

    //todo Task 5
    public void swapTwoNumbers(){
        int x = inputscanner1.nextInt();
        int y = inputscanner1.nextInt();

        System.out.println("Before Swap:");
        System.out.print("x: ");
        System.out.print("y: ");

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After Swap:");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        // input your solution here
    }

    //todo Task 6
    public void compareTwoNumbers(){
        int n1 = inputscanner1.nextInt();
        int n2 = inputscanner1.nextInt();

        System.out.print("n1: ");

        System.out.print("n2: ");

        if (n1 > n2) {
            System.out.println("n1 > n2");

        } else if (n1 < n2) {
            System.out.println("n2 > n1");
        }
        else {
            System.out.println("n1 == n2");
        }
        // input your solution here
    }

    //todo Task 7
    public void ratingSalesPerson(){
        System.out.print("Enter annual Revenue: ");


        int Revenue = inputscanner1.nextInt();

        if (Revenue < 0 || Revenue >= 100000) {
            System.out.println("Invalid Revenue");
        } else if (Revenue < 20000) {

            System.out.println("Poor Sales Revenue");
        } else if (Revenue >= 50000 && Revenue < 80000) {

            System.out.println("Good Sales Revenue");
        } else if (Revenue >= 80000) {

            System.out.println("Excellent Sales Revenue");

        }
        // input your solution here
    }

    //todo Task 8
    public void getCommissionRate(){
        System.out.print("Enter CommissionClass: ");
        int commrate = inputscanner1.nextInt();
        double provision;

        switch (commrate) {
            case 1:
                provision = 0.01;
                break;
            case 2:
                provision = 0.02;
                break;
            case 3:
                provision = 0.03;

                break;
            case 4:
                provision = 0.04;
                break;
            default:
                provision = 0;
                break;
        }
        System.out.println("Your Commission Rate was set to " + provision);
        // input your solution here
    }

    //todo Task 9
    public void leapyear(){
        System.out.print("Year: ");
        int leapyear = inputscanner1.nextInt();

        if (leapyear % 4 == 0 && leapyear % 400 == 0) {

            System.out.println("Leapyear");
        } else {
            System.out.println("Not a Leapyear");
        }
        // input your solution here
    }

    //todo Task 10
    public void transposedNumbers(){
        System.out.print("Number: ");

        int numbers = inputscanner1.nextInt();

        int zehner = numbers % 10;
        int hundert = numbers % 100 / 10;
        int mill = numbers % 1000 / 100;

        if(numbers/10 == 0)  {
            System.out.println(zehner);
        } else if (numbers / 100 == 0)  {

            System.out.println(zehner + "" + hundert);
        } else if (numbers / 1000 == 0) {
            System.out.println(zehner + "" + hundert + "" + mill);
        }
        // input your solution here
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}