package coin.game;

public class CoinGame {
    
    public static void main(String[] args) {
        long x = 5;
        long y = 0;
        
        while (x > 0){
            x *= 2;
            y = 8 * (x/10);
            System.out.println(x+" = "+y);
        }
    }
    
}
