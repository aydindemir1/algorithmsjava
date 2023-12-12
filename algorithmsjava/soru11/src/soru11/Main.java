package soru11;

//11- 0 ile 1000 arasındaki Fibonacci sayılarını bulan programı yazınız?
// 1,1,2,3,5,8,13,21,34,55,...
public class Main {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		int c = 0;
		
		do {
			c = a + b;
			if(c>1000) {
				break;
			}
			System.out.print(c + " - ");
			a = b;
			b = c;
		} while (c<1000);

	}

}
