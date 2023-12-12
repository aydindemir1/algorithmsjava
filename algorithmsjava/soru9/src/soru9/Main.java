package soru9;

import java.util.Scanner;

//9- Kullanıcıdan ismini alıp ekrana tersten yazan programı yazınız?
public class Main {

	public static void main(String[] args) {
		
		String isim;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("lütfen isminizi giriniz : ");
		isim = scanner.nextLine();
		
		int i;
		
		for(i = isim.length() - 1; i >= 0; i--) {
			System.out.print(isim.charAt(i));
		}

	}

}
