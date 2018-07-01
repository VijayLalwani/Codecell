
package cipher;

import java.util.Scanner;

public class Cipher {
    
    public static String Encrypt(String text,String key){
        text = text.toLowerCase();
        key = key.toLowerCase();
        
        String etext = "";
        
        for(int i = 0, j = 0;i<text.length();i++){
            int c = (text.charAt(i)-97)+(key.charAt(j)-97);
            if(c < 0){
                etext += "";
            } 
            else if(c > 26){
                etext += (char)(c + 97 - 26);
                j = ++j % key.length();
                
            }
            else{
                etext += (char)(c + 97);
                j = ++j % key.length();
            }
            
            
        }
        
        return etext;
    }
    
    public static void main(String[] args) {
        String text = "Just finished the TSEC CodeCell Challenge", key = "CodeCell";
        System.out.println("Text to be encrypted: "+text);
        
        String Etext = Encrypt(text,key);
        System.out.println("Encrypted text: "+Etext);
        
    }
    
}
// ust finished the TSEC CodeCell Challenge
