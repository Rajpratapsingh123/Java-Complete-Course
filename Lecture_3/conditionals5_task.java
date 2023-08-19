package Lecture_3;

import java.util.Scanner;

public class conditionals5_task {
   
    public static void main(String[] args) {
        double a; 
        double b; 
        double c;
        char op; 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
         a=sc.nextDouble();
         b=sc.nextDouble();
        System.out.println("Enter opertor");
         op=sc.next().charAt(0);



        switch(op){
            case '+':c=a+b;
            break;
            case '-':c=a-b;
            break;
            case '*':c=a*b;
            break;
            case '/':c=a/b;
            break;
        default:System.out.println("Enter correct operator");
        return;
        }
        System.out.println("The result is ");
        System.out.println(a+""+op+""+b+"="+c);
        
    }
    
}
