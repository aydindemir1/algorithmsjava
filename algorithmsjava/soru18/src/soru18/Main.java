package soru18;

import java.util.Scanner;

//18- Kullanıcıdan alınan 4 basamaklı bir sayıyı yazı ile yazınız? Kullanıcı 3215 girmiş olsun "üç bin iki yüz on beş" ekrana yazılsın.
public class Main {

	public static void main(String[] args) {
		
		int sayi,birler,onlar,yuzler,binler;
		char c;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("4 basamaklı sayı giriniz : ");
		sayi = scanner.nextInt();
		
		c = Integer.toString(sayi).charAt(0);
		binler = Integer.parseInt(Character.toString(c));
		System.out.println(binler);
		
		c = Integer.toString(sayi).charAt(1);
		yuzler = Integer.parseInt(Character.toString(c));
		System.out.println(yuzler);
		
		c = Integer.toString(sayi).charAt(2);
		onlar = Integer.parseInt(Character.toString(c));
		System.out.println(onlar);
		
		c = Integer.toString(sayi).charAt(3);
		birler = Integer.parseInt(Character.toString(c));
		System.out.println(birler);
		
		String[] binlerBasamagi = {"", "bin", "iki bin", "üç bin", "dört bin", "beş bin", "altı bin", "yedi bin", "sekiz bin", "dokuz bin"};
		String[] yuzlerBasamagi = {"", "yuz", "iki yuz", "üç yuz", "dört yuz", "beş yuz", "altı yuz", "yedi yuz", "sekiz yuz", "dokuz yuz"};
		String[] onlarBasamagi = {"", "on", "yirmi", "otuz", "kırk", "elli", "altmış", "yetmiş", "seksen", "doksan"};
		String[] birlerBasamagi = {"", "bir", "iki", "üç", "dört", "beş", "altı", "yedi", "sekiz", "dokuz"};
		
		System.out.println(binlerBasamagi[binler] + " " + yuzlerBasamagi[yuzler] + " " + onlarBasamagi[onlar] + " " + birlerBasamagi[birler]);
	}

}
