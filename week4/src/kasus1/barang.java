package kasus1;

public class barang {
	String kode_barang;
	String nama_barang;
	private int stok;
	
	barang (String kode, String nama, int stk) {
		kode_barang = kode;
		nama_barang = nama;
		setStok(stk);
	}
	
	//getter and setter stok
	public void setStok(int stok) {
		this.stok += stok;	
	}
	int getStok() {
		return stok;
	}

}