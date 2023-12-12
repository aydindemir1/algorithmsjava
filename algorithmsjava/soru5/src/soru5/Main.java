package soru5;

import java.util.Scanner;

//5- Vize notunun %40'ını, Final notunun %60'ını alarak ortalama notu hesaplayan, ortalama 50 den büyükse "Geçti", küçükse "Kaldı" yazan programı yazınız?
public class Main {

	public static void main(String[] args) {
		
		int vize,fnl;
		float ortalama;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("vize : ");
		vize = scanner.nextInt();
		
		System.out.println("final : ");
		fnl = scanner.nextInt();
		
		ortalama =(float) (vize * 0.4 + fnl * 0.6);
		
		System.out.println("ortalamanız : " + ortalama);
		
		if(ortalama >= 50) {
			System.out.println("geçtiniz");
		}else {
			System.out.println("kaldınız");
		}
		

	}

}
