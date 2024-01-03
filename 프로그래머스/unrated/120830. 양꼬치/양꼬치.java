class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int result = 0;
        answer=n*12000;
        result=(k-(n/10))*2000;
        return answer+result;
    }
}