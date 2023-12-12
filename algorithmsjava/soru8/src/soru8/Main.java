package soru8;

import java.util.Scanner;

//8- n'den m'ye kadar olan sayılardan 7'ye tam bölünenleri bulunuz? n başlangıç ve m bitiş sayısı kullanıcıdan alınacaktır.
public class Main {

	public static void main(String[] args) {
		
		int i,n,m;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("başlangıç sayısı : ");
        n = scanner.nextInt();
       
        System.out.println("bitiş sayısı : ");
        m = scanner.nextInt();
        
        for(i = n; i < m; i++) {
        	if(i % 7 == 0) {
        		System.out.print(i + "  ");
        	}
        }
       
		

	}

}
