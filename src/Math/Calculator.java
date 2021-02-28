/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Math;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Calculator {
    
    public static long Factorial(int i){
	if(i==0||i==1) return 1;
	if(i<0){
	    throw new IllegalArgumentException("Number must be >0");
	}
	return i*Factorial(i-1);
    }
    
    public static int equation(int b,int a,int c){
	int result=2;
	int delta=(b*b)-(4*a*c);
	if(delta==0){
	    result=1;
	}
	if(delta<0){
	    result=0;
	}
	return result;
    }
    
    public static void main(String[] args) {
	int choice;
	Scanner sc=new Scanner(System.in);
	do{
	    System.out.println("---Calculator Program---");
	    System.out.println("1.Find the Factorial of N number");
	    System.out.println("2.Find the Quadratic Equation's solutions.");
	    System.out.println("3.Exit");
	    choice=sc.nextInt();
	    switch(choice){
		case 1:
		    System.out.println("Please Enter N Number: ");
		    int i=sc.nextInt();
		    System.out.println("Factorial of N: "+ Calculator.Factorial(i));
		    break;
		case 2:
		    System.out.println("Please Enter A Number: ");
		    int a=sc.nextInt();
		    System.out.println("Please Enter B Number: ");
		    int b=sc.nextInt();
		    System.out.println("Please Enter C Number: ");
		    int c=sc.nextInt();
		    System.out.println("The Number of Quadratic Equation's solutions: "+ Calculator.equation(b, c, a));
		    break;
		default:
		    break;
		
	    }
	    
	}while(choice!=3);
    }
}
