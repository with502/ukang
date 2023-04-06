package programmers.lv0;

public class Q120910 {
	public int solution(int n, int t) {
        int answer = 0;
        for (int i=1; i<=t; i++) {
            n *= 2;
        }
        answer = n;
        return answer;
    }

}
