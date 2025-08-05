/*class Solution {
    public int countPrimes(int n) {
        int c=0;
        if(n>2)
        c=c+1;;
        for(int i=3; i<n; i++)
        {
            int c2=0;
            for(int j=1; j<=i; j++)
            {
                if(i%j==0)
                {
                    c2++;
                }
            }
            if(c2==2)
            {
                c+=1;
            }
        }
        return c;
    }

}*/
class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;

        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for (boolean prime : isPrime) {
            if (prime) count++;
        }

        return count;
    }
}

