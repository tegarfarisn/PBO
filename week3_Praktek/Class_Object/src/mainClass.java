
import java.util.Scanner;
public class mainClass {
	public static void main(String[] args) {
		kampusPITB dir1 = new kampusPITB();
		kampusPITB dos1 = new kampusPITB();
		kampusPITB mhs1 = new kampusPITB();
		kampusPITB staf1 = new kampusPITB();
		kampusPITB sec1 = new kampusPITB();
		String nameDirektur, nameDosen, nameMahasiswa, nameStaff, nameSec;
		
		Scanner scan = new Scanner(System.in);
		
//		Statis  -------------------------
		
		dir1.setDirektur("Ir. Rachmad");
		dos1.setDosen("Bpk. Ghifari munawar");
		mhs1.setMahasiswa("Tegar faris");
		staf1.setStaff("budi");
		sec1.setSecurity("aceng");
		
//		Dinamis -------------------------
		
		System.out.println("masukkan nama direktur 1: ");
		nameDirektur = scan.nextLine();
		dir1.setDirektur(nameDirektur);
		
		System.out.println("masukkan nama dosen 1 : ");
		nameDosen = scan.nextLine();
		dos1.setDosen(nameDosen);
		
		System.out.println("masukkan nama mahasiswa 1 : ");
		nameMahasiswa = scan.nextLine();
		mhs1.setMahasiswa(nameMahasiswa);
		
		System.out.println("masukkan nama staff 1 : ");
		nameStaff = scan.nextLine();
		staf1.setStaff(nameStaff);
		
		System.out.println("masukkan nama Security 1 : ");
		nameSec = scan.nextLine();
		sec1.setSecurity(nameSec);
		
//		output pemanggilan -------------------------------------
		
		System.out.println("Direktur 1  : "+ dir1.getDirektur());
		System.out.println("Dosen 1     : "+ dos1.getDosen());
		System.out.println("Mahasiswa 1 : "+ mhs1.getMahasiswa());
		System.out.println("Staff 1     : "+ staf1.getStaff());
		System.out.println("Security 1  : "+ sec1.getSecurity());
	}
}
