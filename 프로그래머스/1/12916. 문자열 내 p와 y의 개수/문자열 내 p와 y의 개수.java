class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p =0;
        int y =0;
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='p'){
                p++;
            }else if(s.charAt(i)=='y'){
                y++;
            }
        }
        answer = p==y ? true : false;
        return answer;
    }
}