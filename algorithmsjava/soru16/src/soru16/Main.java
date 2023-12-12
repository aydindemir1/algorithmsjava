package soru16;

import java.util.Random;

//16- 3X3 rastgele sayılardan oluşan 2 matris oluşturun.Bu matrislerin, toplamını hesaplayınız.
public class Main {

	public static void main(String[] args) {
		
		int[][] matris1 = new int[3][3];
		int[][] matris2 = new int[3][3];
		int[][] toplam = new int[3][3];
		
		Random random = new Random();
		
		int i,j;
		
		System.out.println("matris 1");
		for(i = 0; i < 3; i++) {
			for(j = 0; j < 3; j++) {
				matris1[i][j] = random.nextInt(5);
				System.out.print(matris1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("");
		
		System.out.println("matris 2");
		for(i = 0; i < 3; i++) {
			for(j = 0; j < 3; j++) {
				matris2[i][j] = random.nextInt(5);
				System.out.print(matris2[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("toplam matrisi");
		for(i = 0; i < 3; i++) {
			for(j = 0; j < 3; j++) {
				toplam[i][j] = matris1[i][j] + matris2[i][j];
				System.out.print(toplam[i][j] + " ");
			}
			System.out.println();
		}

	}

}
