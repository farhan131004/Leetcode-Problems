class Solution {
    public int maxArea(int[] h) {
        int i=0;
        int j=h.length-1,min,a=0,area;
        while(i<j){
            min=Math.min(h[i],h[j]);
            area=min*(j-i);
            a=Math.max(a,area);
            while(i<j && h[i]<=min)
            i++;
            while(i<j && h[j]<=min)
            j--;
        }
        return a;
    }
}
