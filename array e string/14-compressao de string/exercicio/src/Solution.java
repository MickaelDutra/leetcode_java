class Solution {
    public int compress(char[] chars) {
        int index = 0;

        for(int i = 0; i < chars.length;){
            int count = 0;
            char currChar = chars[i];
            int j = i;

            while(j < chars.length && chars[j] == currChar){
                count++;
                j++;
            }
            if(count > 1){
                chars[index++] = currChar;
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[index++] = c;
                }
            }else {
                chars[index++] = currChar;
            }
            i = j;
        }
        System.out.println(chars);

        return index;
    }
}