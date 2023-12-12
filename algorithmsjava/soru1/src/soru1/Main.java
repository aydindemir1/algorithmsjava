package soru1;

import java.util.Scanner;

//1- Kullanıcıdan ismini alarak "Merhaba isim" yazan programı yazınız?
public class Main {

	public static void main(String[] args) {
		
		String isim;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("lütfen isminizi giriniz : ");
		isim = scanner.nextLine();
		
		System.out.println("merhaba " + isim);

	}

}
