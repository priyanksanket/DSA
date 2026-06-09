class Solution {
    public void setZeroes(int[][] mat) {
        int n= mat.length;
        int m= mat[0].length;
        boolean a= false;
        boolean b = false;
        for(int x: mat[0]){
            if(x==0) a = true;
        }
        for(int i= 0;i<n;i++){
            if(mat[i][0]==0) b= true;
        }
        for(int i= 1;i<n;i++){
            for(int j= 1;j<m;j++){
                if(mat[i][j]==0){
                    mat[i][0]=0;
                    mat[0][j]=0;
                }
            }
        }
        for(int i=1;i<m;i++){
            if(mat[0][i]==0){
                for(int j=0;j<n;j++){
                    mat[j][i]=0;
                }
            }
        }
        for(int i=1;i<n;i++){
            if(mat[i][0]==0){
                for(int j=0;j<m;j++){
                    mat[i][j]=0;
                }
            }
        }
        if(a)Arrays.fill(mat[0],0);
        if(b){
            for(int i=0;i<n;i++){
                mat[i][0]= 0;
            }
        }
        
        
    }
}