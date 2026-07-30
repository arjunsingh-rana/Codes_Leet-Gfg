class Solution {
    public int longestPalindromeSubseq(String s) {
        String s1=new StringBuilder(s).reverse().toString();
        return lcs(s,s1);
    }
    public int lcs(String s,String s1){
        int m=s.length();
        int n=s1.length();
        int t[][]=new int[m+1][n+1];

        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0 || j==0){
                    t[i][j]=0;
                }
            }
        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s.charAt(i-1)==s1.charAt(j-1)){
                    t[i][j]=1+t[i-1][j-1];
                }else{
                    t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }
        return t[m][n];
    }
}