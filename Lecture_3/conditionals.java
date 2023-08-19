package Lecture_3;

import java.util.*;
public class conditionals{
public static void main(String[] args) {
   Scanner sc =new Scanner (System.in);
   int button=sc.nextInt();
  

   switch(button){
      case 1 :System.out.println("hello");
      break;
      case 2 :System.out.println("Namaste");
      break;
      case 3 :System.out.println("bonjour");
      break;
      default :System.out.println("invalid input");

   }
   

   // if(n>18){
   //   System.out.println("adult");
   // }else{
   //    System.out.println("teen");
   // }
}

}