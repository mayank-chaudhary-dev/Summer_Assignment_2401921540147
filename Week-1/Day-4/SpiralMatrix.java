class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int fr=0;
        int fc=0;
        int lr=r-1;
        int lc=c-1;
        List<Integer>ans=new ArrayList<>();
        while(fr<=lr&&fc<=lc){
            for(int i=fc;i<=lc;i++){
                ans.add(matrix[fr][i]);
            }fr++;
            for(int i=fr;i<=lr;i++){
                ans.add(matrix[i][lc]);
            }lc--;
            if(fr<=lr){ 
            for(int i=lc;i>=fc;i--){
                ans.add(matrix[lr][i]);
              }lr--;
            }
            if(fc<=lc){ 
            for(int i=lr;i>=fr;i--){
                ans.add(matrix[i][fc]);
            }fc++;
            }
        }
        return ans;
    }
}