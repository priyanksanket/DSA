class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n= fruits.length;
        int [] arr= new int[n];
        for(int i=0;i<n;i++){
            int a= fruits[i];
            for(int j=0;j<n;j++){
                if(arr[j]== 0 && baskets[j]>=a){
                    arr[j]=a;
                    break;
                

                }
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                count++;
                
            }
        }
        return count;
        
    }
}