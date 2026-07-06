// primeira solução encontrada foi a melhor em tempo O(n) e espaço O(1)
class Solution {
    public int largestAltitude(int[] gain) {
        int prefix = 0;
        int maxAltitude = 0;

        for (int num: gain){
            prefix += num;
            maxAltitude = Math.max(prefix, maxAltitude);
        }
        return maxAltitude;
    }
}