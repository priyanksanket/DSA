class Solution {
    public boolean isValid(String s) {
       Stack<Character> st = new Stack<>();
       for(char x : s.toCharArray()){
        if(st.size()<2){
            st.push(x);

        }else if(x=='c'){
            char first = st.pop();
            char second = st.pop();
            if(first == 'b' && second =='a'){
                continue;
            }else{
                st.push(second);
                st.push(first);
                st.push(x);
            }
        }else{
            st.push(x);
        }
       }
       return st.size()==0;
        
    }
}