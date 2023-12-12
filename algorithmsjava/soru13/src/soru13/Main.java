package soru13;

import java.util.Scanner;

//13- Kullanıcıdan 10 adet sayı alan ve tek ve çift sayıların adetini, toplamını ve ortalamalarını bulan programını yazınız?
public class Main {

	public static void main(String[] args) {
	
		int tekToplam,ciftToplam,tekAdet,ciftAdet,sayi;
		float tekOrtalama,ciftOrtalama;
		int i;
		
		Scanner scanner = new Scanner(System.in);
		
		tekAdet  = 0;
		ciftAdet = 0;
		tekToplam = 0;
		ciftToplam = 0;
		
		for(i = 0; i < 10; i++) {
			System.out.println(i + " . sayı : ");
			sayi = scanner.nextInt();
			
			if(sayi % 2 == 0) {
				ciftAdet++;
				ciftToplam += sayi;
			}else {
				tekAdet++;
				tekToplam += sayi;
			}
		}
		
		System.out.println(ciftAdet + " adet çift sayı toplamı : " + ciftToplam);
        System.out.println(tekAdet + " adet tek sayı toplamı : " + tekToplam);
        
        tekOrtalama = (float) tekToplam / tekAdet;
        ciftOrtalama = (float) ciftToplam / ciftAdet;
        
        System.out.println("çift sayıların ortalaması : " + ciftOrtalama);
        System.out.println("tek sayıların ortalaması : " + tekOrtalama);
        

	}

}
