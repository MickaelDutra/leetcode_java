import java.util.*;

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int planted = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            boolean leftIsEmpty = i == 0 || flowerbed[i - 1] == 0 ;
            boolean rightIsEmpty = i == flowerbed.length - 1 || flowerbed[i + 1] == 0 ;
            if (flowerbed[i] == 0) {
                if (leftIsEmpty && rightIsEmpty) {
                    planted++;
                    flowerbed[i] = 1;
                }
            }
        }
        return planted >= n;
    }
}