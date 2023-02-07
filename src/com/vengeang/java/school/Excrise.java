package com.vengeang.java.school;
	import java.text.DecimalFormat;
	import java.util.Scanner;
	
	public class Excrise {

	    public static void main(String[] args) {
	       Scanner obj = new Scanner(System.in);
	       int op,n,sum=0,i;
	       String st;
	        do{
	            System.out.println("---------------- | M E N U | ------------");
	            System.out.println("[1].  2 + 4 + 6 + .... +n");
	            System.out.println("[2].  2/2 + 4/2+ .... + n/2");
	            System.out.println("[3].  sqrt(1) + sqrt(2) + ....+sqrt(n)");
	            System.out.println("[4].  2/2 + 4/4 + .....  + n/n");
	            System.out.println("[5].  1! + 2! + 3! + .... + n!");
	            System.out.println("[6].  9 + 99 + 999 + ... + n"); // 4 = 9+99+999+9999
	            System.out.println("[7].  Exit Application");
	            System.out.println("---------------------------------------------");
	            System.out.print("Choose one Option [1_7] : ");
	            op = obj.nextInt();
	            switch(op)
	            {
	                case 1: {
	                    System.out.println("[1].  2 + 4 + 6 + .... +n");
	                    System.out.print("Enter n : ");
	                    n = obj.nextInt();
	                    for(i=2; i<=n; i+=2){
	                        System.out.print(i+ " + ");
	                        sum=sum+i;
	                    } 
	                    System.out.print("\b\b = " +sum);
	                    sum=0;
	                }break;
	                case 2: {
	                      System.out.println("[2].  2/2 + 4/2+ .... + n/2");
	                      System.out.print("Enter n : ");
	                      n = obj.nextInt();
	                      int j;
	                      for(i=2; i<=n; i+=2){
	                          j=i/2;
	                          sum =sum+j;
	                          System.out.print(i+ " /2" + " + ");
	                      }
	                      System.out.print("\b\b = " +sum);
	                      sum=0;
	                }break;
	                case 3: {
	                    System.out.println("[3].  sqrt(1) + sqrt(2) + ....+sqrt(n)");
	                    System.out.print("Enter n : ");
	                      n = obj.nextInt();
	                      float sqrt,res=0;
	                      DecimalFormat in = new DecimalFormat("0.000");
	                      for(i=1; i<=n; i++){
	                          sqrt = (float) Math.sqrt(i);
	                          res =res+sqrt;
	                          System.out.print("sqrt("+i+")"+" + ");
	                      }
	                      System.out.print("\b\b = " +in.format(res));
	                }break;
	                case 4 : {
	                    System.out.println("[4].  2/2 + 4/4 + .....  + n/n");
	                    System.out.print("Enter n : ");
	                      n = obj.nextInt();
	                      for(i=2; i<=n; i+=2){
	                          System.out.print(i+"/"+i+" + ");
	                           sum =sum+i/i;
	                      }
	                      System.out.print("\b\b = " +sum);
	                }break;
	                case 5 : {
	                    System.out.println("[5].  1! + 2! + 3! + .... + n!");
	                    System.out.print("Enter n : ");
	                    n = obj.nextInt();
	                    int f=1;
	                    for(i=1; i<=n; i++){
	                      System.out.print(i+"!" + " + ");
	                       f=f*i;
	                       sum = sum+f;
	                    }
	                    System.out.print("\b\b = " +sum); 
	                }break;
	                case 6 : {
	                     System.out.println("[6].  9 + 99 + 999 + ... + n");
	                      System.out.print("Enter n : ");
	                       n = obj.nextInt();
	                       int j=0;
	                       for(i=0; i<=n; i++){
	                           j=j*10+9;
	                       	}
	                       sum = sum+j;
                          
               
                        System.out.print("\b\b = " +sum); 
                		}break;
                case 7: {
                    System.out.println("I dont want to this MENU");
                }break;
                default : System.out.println("Wanning Invaild....");                                
        }
            System.out.print("\nPlase Enter 'Y'to Continue : ");
            st = obj.next();
        }while(st.equalsIgnoreCase("y"));
    }
}
