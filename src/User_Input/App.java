package User_Input;

import java.util.Scanner;
public class App{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name");
            String input = sc.nextLine();
            System.out.println("Good Morning," + input);
            System.out.println(input + " Also tell me your age");
            int age = sc.nextInt();
            System.err.println(input + " Your age is " + age);
            System.err.println("Welcome "+ input + " to Java Learning");
            System.out.println("Enter first no");
            int a=sc.nextInt();
            System.out.println("Enter second no");
            int b=sc.nextInt();
            int sum = a+b;
            System.out.println("Sum of "+a+" and "+b+" is "+ sum);

        }
    }
