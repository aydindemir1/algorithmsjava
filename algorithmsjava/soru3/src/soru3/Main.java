package soru3;

import java.util.Scanner;

//3- Kullanıcıdan alınan 3 sayının en büyüğünü bulan programı yazınız?
public class Main {

	public static void main(String[] args) {
		
		int a,b,c;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("birinci sayı  : ");
		a = scanner.nextInt();
		
		System.out.println("ikinci sayı  : ");
		b = scanner.nextInt();
		
		System.out.println("üçüncü sayı  : ");
		c = scanner.nextInt();
		
		if (a > b && a > c) {
			System.out.println("en büyük sayı : " + a);
		}else if(b > a && b > c) {
			System.out.println("en büyük sayı : " + b);
		}else if(c > a && c > b) {
			System.out.println("en büyük sayı : " + c);
		}

	}

}
