class Solution {

    long MOD = 1000000007;

    public int countAnagrams(String s) {

        long answer = 1;

        String[] words = s.split(" ");

        for(int i=0;i<words.length;i++){

            String word = words[i];

            int[] freq = new int[26];

            for(int j=0;j<word.length();j++){
                freq[word.charAt(j)-'a']++;
            }

            long total = factorial(word.length());

            for(int j=0;j<26;j++){

                if(freq[j]>1){
                    total = (total * power(factorial(freq[j]), MOD-2)) % MOD;
                }
            }

            answer = (answer * total) % MOD;
        }

        return (int)answer;
    }

    public long factorial(int n){

        long fact = 1;

        for(int i=1;i<=n;i++){
            fact = (fact * i) % MOD;
        }

        return fact;
    }

    public long power(long a, long b){

        long result = 1;

        while(b>0){

            if(b%2==1){
                result = (result*a)%MOD;
            }

            a = (a*a)%MOD;
            b = b/2;
        }

        return result;
    }
}