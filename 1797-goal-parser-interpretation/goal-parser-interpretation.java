class Solution {
    public String interpret(String s) {
        
        StringBuilder sb= new StringBuilder("");
        for(int i=0;i<s.length();i++){
            char x= s.charAt(i);
            if(x=='G'){
                sb.append('G');

            }else if(x=='('){
                if(s.charAt(i+1)==')'){
                    sb.append('o');
                    i++;
                }else{
                    sb.append("al");
                    i+=3;
                }
            }
        }
        return sb.toString();
    }
}