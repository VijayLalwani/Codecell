package jumping.keyboard;

public class JumpingKeyboard {
    
    public static int JumpCount(String word){
        int count = 0;
        
        for(int i = 1;i < word.length();i++){
            if((int)word.charAt(i-1) < (int)word.charAt(i)){
                count += ((int)word.charAt(i) - (int)word.charAt(i-1)) - 1;
            }
            else if((int)word.charAt(i-1) > (int)word.charAt(i)){
                count += ((int)word.charAt(i-1) - (int)word.charAt(i)) - 1;
            }
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        String word = "supercalifragilisticexpialidocious";
        String word1 = "antidisestablishmentarianism";
        
        int a = JumpCount(word);
        int b = JumpCount(word1);

        System.out.println(a*b);
    }
    
}
