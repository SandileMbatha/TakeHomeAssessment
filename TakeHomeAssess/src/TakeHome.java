import java.util.Arrays;
import java.util.List;

public class TakeHome {
	private static StringBuilder appendRange(StringBuilder sb, int start, int previous) {
	    sb.append(start);
	    if(start!=previous) {
	    	sb.append(previous-start>1? " - ": ", ").append(previous);
	    }
	    return sb;
	}
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,3,6,7,8,12,13,14,15,21,22,23,24,31);
		StringBuilder sb = new StringBuilder();
		int previous = list.get(0);
		int start = previous;
		for(int next: list.subList(1, list.size())) {
		    if(previous+1 != next) {
		        appendRange(sb, start, previous).append(", ");
		        start = next;
		    }
		    previous = next;
		}
		String result = appendRange(sb, start, previous).toString();
		System.out.println(result);
	}

}
