class Solution {
    public String sortSentence(String s) {
        String[] arr= s.split(" ");
        String [] ans= new String[10];
        for(String p: arr){
            int i= (p.charAt(p.length()-1))-'0';
            ans[i]= p.substring(0,p.length()-1);
        }
        StringBuilder sb= new StringBuilder("");
        for(int i=1;i<10;i++){
            if(ans[i]==null) break;
            sb.append(ans[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
        
        
    }
}