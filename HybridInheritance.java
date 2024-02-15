package demotest.com;

 class Details{
int no= 1234;
String name = "gaythri";
int salary= 5000;
 }

class Manager extends Details{
	int pf= 3000;
	int total= salary+pf;
}

interface Hybrid{
	int amount = 1000;
	
	
}
class Office extends Manager implements Hybrid{
	int amount= pf+salary;
	public void show() {
		
		System.out.println("Employee Name:"+ name);
		System.out.println("Employee id:"+ no);
		System.out.println("Employee salary:"+ salary);
		System.out.println("Employee amount:"+ amount);
		System.out.println("Employee pf:"+ pf);
		System.out.println("Employee total:"+ total);
		
	}		
	
}



public class HybridInheritance {
	
	public static void main(String[] args) {
		Office off= new Office();
		off.show();
		
		
	}
		
	}	
		
		
		
		
		

	


