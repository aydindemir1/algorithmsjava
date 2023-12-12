package soru2;

import java.util.Scanner;

//2- Kullanıcıdan iki sayı alarak bunların toplamını ve ortalamasını ekrana yazan programı yazınız?
public class Main {

	public static void main(String[] args) {
		
		int sayi1,sayi2,toplam;
		float ortalama;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("birinci sayı : " );
		sayi1 = scanner.nextInt();
		
		System.out.println("ikinci sayı : " );
		sayi2 = scanner.nextInt();
		
		toplam = sayi1 + sayi2;
		ortalama = (float) toplam / 2;
		
		System.out.println("Toplam : " + toplam);
		System.out.println("Ortalama : " + ortalama);

	}

}
