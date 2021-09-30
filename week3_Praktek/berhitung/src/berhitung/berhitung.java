package berhitung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class berhitung {
    public static void main(String[] argss){
        String[] arrData;
        try (BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
            arrData = (input.readLine().split("\\s+"));
            if(Integer.parseInt(arrData[0]) >= 1 && Integer.parseInt(arrData[2]) <= 1000){
                switch (arrData[1]) {
                    case "+":
                        System.out.println(Integer.parseInt(arrData[0]) + Integer.parseInt(arrData[2]));
                        break;
                    case "-":
                        System.out.println(Integer.parseInt(arrData[0]) - Integer.parseInt(arrData[2]));
                        break;
                    case "*":
                        System.out.println(Integer.parseInt(arrData[0]) * Integer.parseInt(arrData[2]));
                        break;                
                    case "/":
                        System.out.println(Integer.parseInt(arrData[0]) / Integer.parseInt(arrData[2]));
                        break;
                    case "%":
                        System.out.println(Integer.parseInt(arrData[0]) % Integer.parseInt(arrData[2]));
                        break;
                    default:
                        break;
                }
            } else {
                System.out.println("Angka tidak valid (1 ≤ A, B ≤ 1.000)");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}