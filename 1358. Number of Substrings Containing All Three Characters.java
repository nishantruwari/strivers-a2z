class Solution {

    public boolean containsAll(int[] freq){
        return freq[0]>0 && freq[1]>0 && freq[2]>0;
    }
    public int numberOfSubstrings(String s) {

        int n=s.length();

        int[] freq=new int[3];
        int l=0,r=0,count=0,ans=0;

        while(r<n){
            char ch=s.charAt(r);
            freq[ch-'a']++;

            while(l<r && containsAll(freq)){
                char c=s.charAt(l);
                ans+=n-r;
                freq[c-'a']--;

                //freq[]
                ++l;

            }
            ++r;

        }

        return ans;
        
    }
}
