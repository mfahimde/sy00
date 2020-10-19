package com.syntax.class006;

import java.util.Scanner;

public class Training2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program to find largest of three double values using if-else..if and
		 * logical operators provided by a user (numbers must be distinct)
		 */ 
		Scanner scanner=new Scanner(System.in);
				double x,y,z,max;
				x=scanner.nextDouble();
				y=scanner.nextDouble();
				z=scanner.nextDouble();
				
				
				
				if(x>y && x>z) {
					max=x;
				}else if (y>z) {
					max=y;
				}
				else{
					max=z;
					
				}
				System.out.println(max);
				// 2nd way
				double biggest,num1,num2,num3;
				if (num1 > num2) { // if num1 larger than num2
					if (num1 > num3) {
						biggest = num1;
					} else {
						biggest = num3;
					}
				} else { // num2 is larger than num1
					if (num2 > num3) {
						biggest = num2;
					} else {
						biggest = num3;
					}
				}
				System.out.println("tje largest number is"+biggest);
			}
	}


