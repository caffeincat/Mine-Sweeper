import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int row, column;
		
		System.out.println("Mayin Tarlasina Hosgeldiniz !");
		System.out.println("Lutfen oynamak istediginiz harita boyutlarini giriniz !");
		System.out.print("Satir sayisi : ");
		row = scanner.nextInt();
		System.out.print("Sutun sayisi : ");
		column = scanner.nextInt();
		
		MayinTarlasi mayin = new MayinTarlasi(row, column);
		mayin.run();
		
		
		
	}

}
