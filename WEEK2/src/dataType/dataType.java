package dataType;
import java.util.*;
public class dataType {
	public static void main(String[] args){
        
        int T, n, i;
     
        Scanner keyboard = new Scanner(System.in);      //untuk melakukan scan input dari keyboard
        
        System.out.println("Jumlah sample yang akan di check: ");
        T = keyboard.nextInt();                         //input jumlah sample yang akan di check
        
        //melakukan perulangan sebanyak T kali 
        for (i=0 ; i < T ; i++){
            try{
                n = keyboard.nextInt();                         
                System.out.println(n+" can be fitted in:");     
                    if(n>=Byte.MIN_VALUE && n<=Byte.MAX_VALUE) System.out.println("* byte");        //cek apakah sample memenuhi value tipe data byte
                    if(n>=Short.MIN_VALUE && n<=Short.MAX_VALUE) System.out.println("* short");     //cek apakah sample memenuhi value tipe data short
                    if(n>=Integer.MIN_VALUE && n<=Integer.MAX_VALUE) System.out.println("* int");   //cek apakah sample memenuhi value tipe data int
                    if(n>=Long.MIN_VALUE && n<=Long.MAX_VALUE)System.out.println("* long");         //cek apakah sample memenuhi value tipe data long
            }
            catch(Exception e) {
                System.out.println(keyboard.next()+" can't be fitted anywhere.");   
            }
        }
    }
}
