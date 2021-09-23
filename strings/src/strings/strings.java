package strings;

import java.util.*;         //memberi program seluruh akses class yang ada pada package java.util

public class strings {
    public static void main(String[] args){
        String A, B;        //deklarasi variabel A dan B dengan tipe data string
        int sum, x;         //deklarasi variabel sum dan x dengan tipe data int
        
        Scanner keyboard = new Scanner(System.in);      //untuk melakukan scan input dari keyboard
        
        A = keyboard.nextLine();            //mengambil input string dari keyboard dan disimpan di variabel A
        B = keyboard.nextLine();            //mengambil input string dari keyboard dan disimpan di variabel B
        
        sum = A.length() + B.length();      //menjumlahkan panjang dari string yang ada dalam variabel A dan B
                                            //sebelum dijumlah string dalam variabel A dan B dicari panjangnya terlebih dahulu dengan method length()
        System.out.println(sum);            //menampilkan nilai dari variabel sum
        
        x = A.compareTo(B);                 //membandingkan A dan B
        if(x>0){
             System.out.println("Yes");     //menampilkan Yes apabila A lebih besar dari B
        } else{
             System.out.println("No");      //menampilkan No apabila A lebih kecil dari B
        }
        
        A = A.substring(0,1).toUpperCase()+A.substring(1);      //merubah huruf pertama dari string dalam var A menjadi kapital
        B = B.substring(0,1).toUpperCase()+B.substring(1);      //merubah huruf pertama dari string dalam var B menjadi kapital
        System.out.println(A+" "+B);                            //menampilkan isi variabel A dan B yang dipisahkan oleh spasi

        
    }
}