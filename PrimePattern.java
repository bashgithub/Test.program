package demotest.com;

import java.util.Scanner;
public class PrimePattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
		int no= sc.nextInt();
		
		int a=no;
		int v=0;
		
		while(a !=0) {
			v=v+a;
			a++;
		}
		 System.out.print(v);
		 int s[]=new int[v];
		 int r=0;
		 int count=0;
		 
		 System.out.println("");
		 
		 for(int i=2;i<=100;i++) {
			 for(int j=2;j<=i-1; j++) {
				 if(i%j==0) {
					 count++;
				 }
			 }
			 if(count==0) {
				 
				 System.out.print(i+" ");
				 s[r]=i;
				 r++;
				 if(r==v) {
					 break;
				 }
			 }
			 else {
				 count=0;
			 }
		 }
		 int l=0;
		  System.out.println("");
		  for(int k=l; k<=no; k++) {
			  for(int e=l; e<=l;e++) {
				  System.out.print(s[l]+" ");
				  l++;
			  }
			   System.out.println(" ");
				 }
			 }
		 
         } 
		

	


