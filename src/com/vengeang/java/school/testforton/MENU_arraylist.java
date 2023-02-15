package com.vengeang.java.school.testforton;

import java.util.ArrayList;
import java.util.Scanner;

public class MENU_arraylist {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,i;
        int op;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        System.out.println("[1]. Add"); 
      System.err.print("Enter n: ");
      n=in.nextInt();
      for(i=0; i<n; i++){
          System.out.print(" Array ["+i+"] : ");
          list.add(in.nextInt());
      }
      System.out.println(list);
      for(i=0; i<list.size(); i++){
        System.out.println(list.get(i));
    }
//           do{
//                System.out.println("------ M E N U  --------");
//                System.out.println("[1]. Add"); 
//                System.out.println("[2]. Show");
//                System.out.println("[3]. Search");
//                System.out.println("[4]. Update");
//                System.out.println("[5]. Delete");
//                System.out.println("[6]. Remove");
//                System.out.println("[7]. Sort");
//                System.out.println("[8]. Exit");
//                System.out.println("--------------(^-^)----------");
//                System.out.print("Pls Enter Option [1-8] : ");
//                op= in.nextInt();
//                switch(op){
//                    case 1: {
//                        System.out.println("[1]. Add"); 
//                        System.err.print("Enter n: ");
//                        n=in.nextInt();
//                        for(i=0; i<n; i++){
//                            System.out.print(" Array ["+i+"] : ");
//                            list.add(in.nextInt());
//                        }
//                        System.out.println(list);
//                        }break;
//                    case 2: {
//                       System.out.println("[2]. Show");
//                       for(i=0; i<list.size(); i++){
//                           System.out.println(list.get(i));
//                       }
//                     }break;
//                }
//            }while(op>9);
        }
}