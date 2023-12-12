package soru17;

import java.util.Random;
import java.util.Scanner;

//17- Kullanıcın girdiği mXn boyutta bir matris oluşturup bu matrisi rastgele sayılarla doldurunuz. Bu matrisin transpozesini oluşturunuz?
public class Main {

	public static void main(String[] args) {
		
		int satir,sutun;
		int i,j;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("satır sayısını giriniz : ");
		satir = scanner.nextInt();
		
		System.out.print("sütun sayısını giriniz : ");
		sutun = scanner.nextInt();
		
		int[][] matris = new int[satir][sutun];
		
		Random random = new Random();
		for(i = 0; i < satir; i++) {
			for(j = 0; j < sutun; j++) {
				matris[i][j] = random.nextInt(5);
				System.out.print(matris[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\n Transpoze matris");
		int[][] transpoze = new int[sutun][satir];
		
		for(i = 0; i < sutun; i++) {
			for(j = 0; j < satir; j++) {
				transpoze[i][j] = matris[j][i];
				System.out.print(transpoze[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
