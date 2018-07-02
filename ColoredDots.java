package coloreddots;

public class ColoredDots {
    
    public static int count(String text){
        int c = 0;
        text = text.toLowerCase();
        text = text.replaceAll("[^a-zA-Z]", "");
        for(int j = 1;j<text.length()+10;j++){
            for(int i = 1;i<text.length();i++){              
                if(text.charAt(i-1)==text.charAt(i)){
                    StringBuilder sb = new StringBuilder(text);
                    sb.deleteCharAt(i);
                    sb.deleteCharAt(i-1);
                    text = sb.toString();
                    c++;
                } 
            }
        }
        return c;
    }
    
    public static void main(String[] args) {
        String a = "Through three cheese trees three free fleas flew. While these fleas flew, freezy breeze blew. Freezy breeze made these three trees freeze. Freezy trees made these trees’ cheese freeze. That’s what made these three free fleas sneeze.";
        String b = "I was just beginning to yawn with nerves thinking he was trying to make a fool of me when I knew his tattarrattat at the door.";
        String c = "Betty Botter bought some butter, but, she said, the butter’s bitter; if I put it in my batter it will make my batter bitter, but a bit of better butter will make my batter better. So she bought a bit of butter better than her bitter butter, and she put it in her batter and the batter was not bitter. So ’twas better Betty Botter bought a bit of better butter.";  
        int x = count(a);
        System.out.println(x);
        int y = count(b);
        System.out.println(y);
        int z = count(c);
        System.out.println(z);
        
        System.out.println("The total count is: "+(x*y*z));
    }
    
}
