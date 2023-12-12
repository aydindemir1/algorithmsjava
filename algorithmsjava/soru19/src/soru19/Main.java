package soru19;

//19- Tersten yazıldığında da aynı değeri olan sayılara Palindrom sayılar denir. Örnek olarak "1991" veya "34543" sayıları tersten yazılsa bile aynı değerde olurlar. 1000 - 100000 sayıları arasındaki palindromları bulan programı yazınız?
public class Main {

	public static void main(String[] args) {
	
		int i,j;
		String duz,ters;
		
		for(i = 1000; i < 100000; i++) {
			duz = Integer.toString(i);
			ters = "";
			
			for(j = duz.length() - 1; j>=0; j--) {
				ters += duz.charAt(j);
			}
			
			if(duz.equals(ters)) {
				System.out.print(i + " - ");
			}
		}

	}

}
