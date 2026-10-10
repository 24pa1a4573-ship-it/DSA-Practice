// Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at most one cookie.

// Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will be content with; 
// and each cookie j has a size s[j]. If s[j] >= g[i], we can assign the cookie j to the child i, 
//   and the child i will be content. Your goal is to maximize the number of your content children and output the maximum number.

// we can use 2 loops for g iterator and find smallest value in s for g[i],  but we get TLE. so, we sort both arrays and checks.

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0,j=0;
        while(i<g.length && j<s.length){
            if(g[i]<=s[j]) i++;
            j++;
        }
        return i;
    }
}
