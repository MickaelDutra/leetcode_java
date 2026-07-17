class Solution extends GuessGame {
    public int guessNumber(int n) {
        int mid;
        int left = 1;
        int right = n;

        while (left <= right) {
            mid = left + (right - left) / 2;
            int returnGuess = guess(mid);

            if (returnGuess == 0) {
                return mid;
            }
            else if (returnGuess < 0){
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return -1;
    }
}