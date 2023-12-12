package soru20;

import java.util.Scanner;

//20-Kullanıcıdan alınan bir cümlede kaç adet kelime olduğunu ve kaç adet harf olduğunu bulan programı yazınız?
public class Main {

	public static void main(String[] args) {
		
		String cumle;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("cümle giriniz : ");
		cumle = scanner.nextLine();
		
		System.out.println("harf sayısı : " + cumle.length());

		int sayac = 0;
		for(int i = 0; i < cumle.length(); i++) {
			if(cumle.charAt(i) == ' ') {
				sayac++;
			}
		}
		
		System.out.println("kelime sayısı : " + (sayac + 1));
	}

}
