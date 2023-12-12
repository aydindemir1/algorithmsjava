package soru14;

import java.util.Scanner;

//14- Kullanıcının istediği kadar sayıyı, kullanıcıdan alarak bir diziye aktaran, bu sayıların toplamını ve ortalamasını bulan programını yazınız?
public class Main {

	public static void main(String[] args) {
		
		int diziBoyutu,toplam;
		float ortalama;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("dizi boyutunu giriniz : ");
		diziBoyutu = scanner.nextInt();
		
		int[] dizi = new int[diziBoyutu];
		
		toplam = 0;
		for(int i = 0; i < diziBoyutu; i++) {
			System.out.print(i + " . eleman : ");
			dizi[i] = scanner.nextInt();
			toplam += dizi[i];
		}
		ortalama = (float) toplam / diziBoyutu;
		
		System.out.println("toplam : " + toplam);
        System.out.println("ortalama : " + ortalama);
	}

}
