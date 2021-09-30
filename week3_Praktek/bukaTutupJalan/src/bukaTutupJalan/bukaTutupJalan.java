package bukaTutupJalan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

public class bukaTutupJalan {
    static BigInteger operasi(String data){
        BigInteger bigInteger = new BigInteger(data);
        BigInteger hasil = bigInteger.subtract(BigInteger.valueOf(999999)).mod(BigInteger.valueOf(5));
        return hasil;
    }
    public static void main(String[] args){
        String[] arrData;
        String kalimat = "";
        try (BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
            String mentahan = input.readLine();
            arrData = (mentahan.split("\\s+"));
            kalimat = Arrays.asList(arrData).stream().map(value -> value).reduce(kalimat, String::concat);
            System.out.println(operasi(kalimat) == BigInteger.ZERO ? "berhenti" : "jalan");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }    
    }
}
