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

        // relational operators
        // order of relational operator is less than arithmetic operator
        int age=11;
        if(age>=18){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not eligible");
        }

        // Logical Operators
        // low priority than math and comparison operators
    
        int a=56;
        int amt=100;
        double des;
        boolean male=false;
        if(a<5){
            des=amt - ((75.0/100)*amt);
        }
        else if(male==false){
            des=amt-((50.0/100)*amt);
        }
        else if(a>60 && male==true){
            des=amt-((75.0/100)*amt);
        }
        else{
            des=amt;
        }
        System.out.println(des);
        int numb=-34;
        if(numb<0){
            System.out.println("Less than zero");
        }
        else if(numb>0){
            System.out.println("Greater than zero");
        }
        else{
            System.out.println("Zero");
        }
        int number = 4;
        if(number%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        int a1=2;
        int f1=5;
        int g1=2;
        if(a1>=f1 && a1>=g1){
            System.out.println(a1+" is greatest");
        }
        else if(f1>=a1 && f1>=g1){
            System.out.println(f1+" is greatest");
        }
        else{
            System.out.println(g1+" is greatest");
        }
        int year =2025;
        if(year%400==0 || ((year%4==0) && (year%100!=0)))
        {
            System.out.println("Leap year");
        }
        else {
            System.out.println("Not leap year");
        }
        int grade = 76;
        if(grade>=90){
            System.out.println("A");
        }
        else if(grade>=75 && grade<90){
            System.out.println("B");
        }
        else if(grade>=60 && grade<75){
            System.out.println("C");
        }
        else if(grade>=30 && grade<60){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }
        int agee=34;
        if(agee<13){
            System.out.println("Child");
        }
        else if(agee<20 && agee>=13){
            System.out.println("Teen");
        }
        else if(agee<60 && agee>=20){
            System.out.println("Adult");
        }
        else{
            System.out.println("Senior");
        }
        // bitwise operators
        int ag=6;
        int bg=12;
        System.out.println("AND: "+ (ag&bg));
        System.out.println("OR: "+ (ag|bg));
        System.out.println("XOR: "+ (ag^bg));
        System.out.println("NOT: "+ (~ag));
        // power 
        System.out.println("Left: "+ (ag<<4));
        // division by 2
        System.out.println("Right: "+ (ag>>1));
        int no=456;
        if(((no&1) == 0)){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

        








    }
}
