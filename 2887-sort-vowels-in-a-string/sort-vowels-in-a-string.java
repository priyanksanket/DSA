class Solution {
    public String sortVowels(String s) {
       List<Character> l = new ArrayList<>();
       for(char x: s.toCharArray()){
        if((x=='a') || (x=='e')|| (x=='i')|| (x=='o')|| (x=='u') ||
        (x=='A') || (x=='E')|| (x=='I')|| (x=='O')|| (x=='U') ){
            l.add(x);
        }
       }
       Collections.sort(l);
       int ind = 0;
       StringBuilder sb = new StringBuilder();
       for(char x: s.toCharArray()){
        if((x=='a') || (x=='e')|| (x=='i')|| (x=='o')|| (x=='u') ||
        (x=='A') || (x=='E')|| (x=='I')|| (x=='O')|| (x=='U') ){
            sb.append(l.get(ind));
            ind++;
        }else{
            sb.append(x);
        }
       }
       return sb.toString();

        
        
    }
}