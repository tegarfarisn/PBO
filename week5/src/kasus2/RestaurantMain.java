package kasus2;
import java.util.Scanner;
public class RestaurantMain {
	static void inisialisasiMakanan(Restaurant menu) {
		menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
		menu.tambahMenuMakanan("Gehu", 1_000, 20);
		menu.tambahMenuMakanan("Tahu", 1_000, 10);
		menu.tambahMenuMakanan("Molen", 1_000, 20);
	}
	public static void main(String[] args) {
		String pesanan;
		byte jumlahPesanan;
		Restaurant menu = new Restaurant();
		Scanner scanner = new Scanner(System.in);
		inisialisasiMakanan(menu);
		
		menu.tampilMenuMakanan();
		System.out.println();
		System.out.println("makanan yang ingin dipesan: ");
		pesanan = scanner.next();
		System.out.println("jumlah yang di beli: ");
		jumlahPesanan = scanner.nextByte();
		menu.pesanMenuMakanan(pesanan,jumlahPesanan);
		
		menu.tampilMenuMakanan();
		
	}
}