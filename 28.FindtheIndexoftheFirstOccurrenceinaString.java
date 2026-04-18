class Solution {
    public int strStr(String haystack, String needle) {
        int l=0;
        int n=haystack.length();
        int r=0;
        int h=needle.length();
        while(l<=r && r<n){
            if(haystack.charAt(l)==needle.charAt(0)){
                if(needle.charAt(r-l)==haystack.charAt(r))
                {
                    r++;
                }
                else{
                    l++;
                    r=l+1;
                }}
            else{
            l++;
            r=l;}if(r-l==h)return l;

        }return -1;

    }
   
}
