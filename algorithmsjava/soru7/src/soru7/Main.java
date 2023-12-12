package soru7;

import java.util.Scanner;

//7- 1'den n'e kadar olan sayılardan tek olanların toplamını bulunuz? n sayısı kullanıcıdan alınacaktır
public class Main {

	public static void main(String[] args) {
		
		int i,toplam,n;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("bir sayı giriniz : ");
		n = scanner.nextInt();
		
		toplam = 0;
		for(i = 1; i < n; i++) {
			if(i % 2 == 1) {
				toplam += i;
			}
		}
		
		System.out.println("1 den  " + n + "   e kadar olan tek sayılar toplamı : " + toplam);

	}

}
