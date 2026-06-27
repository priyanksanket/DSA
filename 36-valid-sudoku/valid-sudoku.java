class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n=9;
        for(int i=0;i<9;i++){
            Set<Character> st = new HashSet<>();
            for(int j=0;j<9;j++){
                char x = board[i][j];
                if(x =='.') continue;
                else {
                    if(st.contains(x)) return false;
                    st.add(x);
                }

            }
        }
        for(int j=0;j<9;j++){
            Set<Character> st = new HashSet<>();
            for(int i=0;i<9;i++){
                char x = board[i][j];
                if(x =='.') continue;
                else {
                    if(st.contains(x)) return false;
                    st.add(x);
                }

            }
        }
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                Set<Character> st = new HashSet<>();
                for(int a = i;a<i+3;a++){
                    for(int b = j;b<j+3;b++){
                        char x = board[a][b];
                        if(x=='.')continue;
                        if(st.contains(x)) return false;
                        st.add(x);
                    }
                }


            }
        }
        return true;

        
    }
}