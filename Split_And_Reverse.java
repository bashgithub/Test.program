package demotest.com;

public class Split_And_Reverse {

	public static void main(String[] args) {
		
		String s = "my name is raj";
		System.out.println(s);
		
		String str[]=s.split(" ");
		
		int j=0; String f;
		for(int i=0; i<str.length;i++) {
			f=str[i];
			StringBuilder sd = new StringBuilder(f);
			sd.reverse();
			System.out.print(sd+" ");
			j++;
		}

	}

}
