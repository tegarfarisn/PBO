package input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class input_output {
    public static void main(String[] args){
        int jmlTokens = 1;
        String[] arrTokens = {"","","",""};
        String mentahan;
        try (BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
            mentahan = input.readLine();
            for(int i = 0; i < mentahan.length(); i++) {
                if(mentahan.charAt(i) == ' ' || mentahan.charAt(i) == '!' || mentahan.charAt(i) == ',' || mentahan.charAt(i) == '?' || mentahan.charAt(i) == '.'|| mentahan.charAt(i) == '_'|| mentahan.charAt(i) == '\'' || mentahan.charAt(i) == '@' ) {
                    jmlTokens++;
                } else {
                   arrTokens[jmlTokens-1] += mentahan.charAt(i);
                }
            }
            System.out.println(jmlTokens);
            for(String token : arrTokens){
                System.out.println(token);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
