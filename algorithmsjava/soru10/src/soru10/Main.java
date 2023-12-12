package soru10;

import java.util.Scanner;

//10- Kullanıcıdan ismini ve soyismini alarak içerisinde kaç adet sesli kaç adet sessiz harf olduğunu bulan programı yazınız
public class Main {

	public static void main(String[] args) {
		
		String isim;
		int sesli = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("isminiz : ");
		isim = scanner.nextLine();
		
		for(int i = 0; i < isim.length(); i++) {
			char c = isim.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'ı' || c == 'o' || c == 'ö' || c == 'u' || c == 'ü') {
				sesli++;
			}
		}
		
		System.out.println("sesli sayısı : " + sesli);
		System.out.println("sessiz sayısı : " + (isim.length() - sesli));

	}

}
