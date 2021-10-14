package kasus2;

public class Restaurant {
	private Makanan menu_makanan;

	
	public Restaurant() {
		menu_makanan = new Makanan();
	}
	public void tambahMenuMakanan(String nama, double harga, int stok) {
		menu_makanan.setNama_makanan(nama);
		menu_makanan.setHarga_makanan(harga);
		menu_makanan.setStok(stok,Makanan.getIdMakanan());
		Makanan.nextIdMakanan();
	}
	public void tampilMenuMakanan(){
		for(byte i =0; i<= Makanan.getIdMakanan() ;i++){
			if(!isOutOfStock(i)){
				System.out.println(menu_makanan.getNama_makanan(i) +"["+menu_makanan.getStok(i)+"]"+"\tRp. "+menu_makanan.getHarga_makanan(i));
			}
		}
	}
	
	public boolean isOutOfStock(byte id){
		if(menu_makanan.getStok(id) == 0){
			return true;
		}else{
			return false;
		}
	}
	
	public void pesanMenuMakanan(String nama,byte jumlah) {
		byte idTemp = menu_makanan.cariIdMakanan(nama);
		if(menu_makanan.getStok(idTemp)>=jumlah) {
			menu_makanan.setStok(-jumlah, idTemp);
		}else {
			if(menu_makanan.getStok(idTemp)>0) {
				System.out.println("maaf stok "+menu_makanan.getNama_makanan(idTemp)+" tidak ada sesuai dengan jumlah");
			}else {
				System.out.println("maaf stok "+menu_makanan.getNama_makanan(idTemp)+" sedang kosong");
			}
		}
	}
}