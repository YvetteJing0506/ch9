import java.util.Arrays;
public class Stats {
	public static void main(String[] args) {
		countNum(Integer.parseInt(args));
	}
	public static countNum(int[] num) {
		int num = 0;
		for (int i=0; i<num.length; i++) {
			if (num.charAt(i)==' ') {
				num++;
			} 
		} return num+1;
	}
}
