package soru15;

import java.util.Random;
import java.util.Scanner;

// 15- Kullanıcının istediği büyüklükte bir diziyi 0-100 arasında rastgele oluşturulmuş sayılarla doldurup bu sayıların standart sapmasını hesaplayınız
public class Main {

	public static void main(String[] args) {
		
		int boyut, toplam,i;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("dizi boyutunu giriniz : ");
		boyut = scanner.nextInt();
		
		int[] dizi = new int[boyut];
		
		Random random = new Random();
		
		toplam = 0;
		for( i = 0; i < boyut; i++) {
			dizi[i] = random.nextInt(100);
			System.out.print(dizi[i] + " - ");
			toplam += dizi[i];
		}
		
		float ortalama = (float) toplam / boyut;
		System.out.println("\nortalama : " + ortalama);
		
		
		float farkToplam = 0;
		for(i = 0; i < boyut; i++) {
			farkToplam += Math.pow(dizi[i] - ortalama, 2);
		}
		
		double standartSapma;
		
		standartSapma = Math.sqrt(farkToplam / (boyut - 1));
		
		System.out.println("standart sapma : " + standartSapma);
		
		

	}

}
