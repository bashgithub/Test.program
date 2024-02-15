package demotest.com;

public class SumOfDigits {

	public static void main(String[] args) {
		
		String a= "123456";
		int b = Integer.parseInt(a);
		int num =b;
		int remainder;
		int sum=0;
	     
	    while (num!=0) {
		 remainder = num%10;
		 num=num/10;
		 sum=sum+remainder;
		}
	     System.out.println("sum of digits: "+sum);

	}

}
