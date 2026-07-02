class Solution {
    public String[] findWords(String[] words) {
        String first = "qwertyuiopQWERTYUIOP";
        String second = "asdfghjklASDFGHJKL";
        String third = "zxcvbnmZXCVBNM";
        List<String> l= new ArrayList<>();
        Set<Character> s1 = new HashSet<>();
        Set<Character> s2 = new HashSet<>();
        Set<Character> s3 = new HashSet<>();
        for(char x:first.toCharArray()){
            s1.add(x);
        }
        for(char x:second.toCharArray()){
            s2.add(x);
        }
        for(char x:third.toCharArray()){
            s3.add(x);
        }
        
        for(String word: words){
            char i = word.charAt(0);
            boolean flag = true;
            if(s1.contains(i)){
                for(int j = 1;j<word.length();j++){
                    if(!s1.contains(word.charAt(j))){
                        flag = false;
                        break;
                    }
                }
            }else if(s2.contains(i)){
                for(int j = 1;j<word.length();j++){
                    if(!s2.contains(word.charAt(j))){
                        flag = false;
                        break;
                    }
                }
            }else{
                for(int j = 1;j<word.length();j++){
                    if(!s3.contains(word.charAt(j))){
                        flag = false;
                        break;
                    }
                }
            }
            if(flag){
                l.add(word);
            }
        }
        String [] ans = new String[l.size()];
        for(int i=0;i<l.size();i++){
            ans [i]= l.get(i);
        }
        return ans;
        
    }
    
}