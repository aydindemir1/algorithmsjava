package soru4;

import java.util.Scanner;

//4- İkinci dereceden ax2 + bx + c = 0 denkleminin diskriminant çözümünü yapınız? Kullanıcıdan a,b ve c değerlerini alarak deltayı hesaplayınız?
public class Main {

	public static void main(String[] args) {
		
		int a,b,c,delta;
		float kok1,kok2;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("a sayısı : ");
		a = scanner.nextInt();
		
		System.out.println("b sayısı : ");
		b = scanner.nextInt();
		
		System.out.println("c sayısı : ");
		c = scanner.nextInt();
		
		delta = b * b - ( 4 * a * c);
		
		if(delta > 0) {
			System.out.println("denklemin iki kökü vardır.");
		    kok1 = (float) (-b - Math.sqrt(delta)) / 2 * a;
		    kok2 = (float) (-b + Math.sqrt(delta)) / 2 * a;
		    System.out.println("kök 1 : " + kok1);
		    System.out.println("kök 2 : " + kok2);
		}else if(delta == 0) {
			System.out.println("denklemin iki kökü vardır.");
		    kok1 = (float) (-b) / 2 * a;
		    System.out.println("kökler : " + kok1);
		}else {
			System.out.println("denklemin kökü yoktur");
		}
		

	}

}
