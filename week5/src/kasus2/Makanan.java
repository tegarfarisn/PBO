package kasus2;

public class Makanan {
	private String[] nama_makanan;
	private double[] harga_makanan;
	private int[] stok;
	private static byte idMakanan=0;
	
	public Makanan() {
		this.nama_makanan = new String[10];
		this.harga_makanan = new double[10];
		this.stok = new int[10];
	}
	public String getNama_makanan(byte id) {
		return this.nama_makanan[id];
	}
	public void setNama_makanan(String nama_makanan) {
		this.nama_makanan[idMakanan] = nama_makanan;
	}
	public double getHarga_makanan(byte id) {
		return harga_makanan[id];
	}
	public void setHarga_makanan(double harga_makanan) {
		this.harga_makanan[idMakanan] = harga_makanan;
	}
	public int getStok(byte id) {
		return stok[id];
	}
	public void setStok(int stok,int id) {
		this.stok[id] += stok;
	}
	
	public byte cariIdMakanan(String nama) {
		for(byte i = 0;i<=idMakanan;i++) {
			if(nama.compareTo(this.nama_makanan[i])==0) {
				return i;
			}
		}
		return -1;
	}
	
	public static void nextIdMakanan() {
		idMakanan++;
	}
	public static byte getIdMakanan() {
		return idMakanan;
	}
	
}
