package soru12;

//12- 0 ile 1000 arasındaki Asal sayıları bulan programı yazınız?
public class Main {

	public static void main(String[] args) {
		
		int bolenSayac = 0;
		int i,j;
		for(i = 3; i < 1000; i++) {
			for(j = 2; j < i; j++) {
				if(i%j == 0) {
					bolenSayac++;
				}
			}
				if(bolenSayac == 0) {
					System.out.print(i + " - ");
				}
				bolenSayac = 0;
			
		}

	}

}
