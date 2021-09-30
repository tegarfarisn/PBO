package bigNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class bigNumber {
    public static void main(String[] args){
        BigInteger[] arrData = new BigInteger[2];
        try (BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
            for(int i = 0; i < 2; i++) {
                arrData[i] = BigInteger.valueOf(Long.parseLong(input.readLine()));
            }
            System.out.println(arrData[0].add(arrData[1]));
            System.out.println(arrData[0].multiply(arrData[1]));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
