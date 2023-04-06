package programmers.lv0;

public class Q120893 {
	 public String solution(String my_string) {
	        String answer = "";
	        String pattern = "[A-Z]";
	        String[] arr = my_string.split("");
	        for (int i=0; i<arr.length; i++) {
	            if (arr[i].matches(pattern)) {
	                answer += arr[i].toLowerCase();
	            } else {
	                answer += arr[i].toUpperCase();
	            }
	        }
	        return answer;
	    }

}
