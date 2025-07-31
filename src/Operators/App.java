package Operators;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // assigment operator
        int num = 9;
        System.out.println(num);
        int num2=num;
        System.err.println(num2);
        // swap
        int num1=4;
        int num22=5;
        int temp=0;
        temp=num1;
        num1=num22;
        num22=temp;
        System.out.println(num1);
        System.out.println(num22);
        // arithmetic operators
        int g=8;
        int h=5;
        int sum = g+h;
        System.out.println("g+h :" + sum);
        int sub = g-h;
        System.out.println("g-h :" + sub);
        int mul = g*h;
        System.out.println("g*h :" + mul);
        int div = g/h;
        System.out.println("g/h :" + div);
        int modd = g%h;
        System.out.println("g%h :" + modd);
        double d= 6;
        double r=5;
        System.out.println(d+r);
        System.out.println(d-r);
        System.out.println(d*r);
        System.out.println(d/r);
    //    order of operation
        System.out.println(8-3*3);
        System.out.println(9/3/3);
        System.out.println(9/(3/3 + 2));
        // shorthand operation
        int f=5;
        // int x1 = sc.nextInt();
        // f+=x1;
        // System.out.println(f);
        // int x2 = sc.nextInt();
        // f+=x2;
        // System.out.println(f);
        // int x3 = sc.nextInt();
        // f+=x3;
        // System.out.println(f);
        // int x4 = sc.nextInt();
        // f+=x4;
        // System.out.println(f);

        // unary operator
        int u = 5;
        System.out.println(++u);
        System.out.println(u++);
        System.out.println(u--);
        System.out.println(--u);

        float w=7.2f;
        float q=7;
        System.out.println(w*q);
        // perimeter of reactangle
        int z = 4;
        int d1=6;
        int r1=2;
        int o=9;
        System.out.println("Perimeter:"+ (z+d1+r1+o));
        // area of traingle
        int b1=4;
        int h1=2;
        System.out.println("Area:"+(0.5*b1*h1));
        // SI
        int p1=10000;
        float r11 = 8.5f;
        int t = 3;
        System.out.println("SI:"+ ((p1*r11*t)/100));
        // CI
        float ft = (float)(p1*Math.pow((1+r11/100),t));
        System.out.println("CI: "+ ft);
        // temperature change
        float f11 = 74f;
        System.out.println("in celsius: "+ ((f11-32)*5/9));





    }
}
