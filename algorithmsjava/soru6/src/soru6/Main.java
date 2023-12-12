package soru6;

//6- 1'den 100'e kadar olan sayıların toplamını bulunuz?
public class Main {

	public static void main(String[] args) {
		
		int i;
		int toplam = 0;
		
		for(i = 1; i < 100; i++) {
			//toplam = toplam + i;
			toplam += i;
		}
		
		System.out.println("1-100 arası sayıların toplamı  : " + toplam);

	}

}
