class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) 
            return true;

        int l = flowerbed.length;
        int t = 0;

        if (l == 1) {
            return (flowerbed[0] == 0 && n <= 1); 
        }

        if (flowerbed[0] == 0 && flowerbed[1] == 0) {
            flowerbed[0] = 1;
            t++;
        }

        for (int i = 1; i < l - 1; i++) {
            if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0 && flowerbed[i] == 0) {
                flowerbed[i] = 1;
                t++;
            }
        }

        if (flowerbed[l - 1] == 0 && flowerbed[l - 2] == 0) {
            flowerbed[l - 1] = 1;
            t++;
        }

        return t >= n;  
    }
}
