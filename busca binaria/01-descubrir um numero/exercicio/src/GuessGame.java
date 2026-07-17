public class GuessGame {
    int pick = 2;
    public int guess(int num){
        return Integer.compare(pick, num);
    }
}
