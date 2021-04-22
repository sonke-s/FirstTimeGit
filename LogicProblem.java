package logic_prolem_sonke;

public class LogicProblem {
	public void main() {
		
	}
	
	/*
	 * Given three ints, a b c, one of them is small,
	 * one is medium and one is large. Return true if the
	 * three values are evenly spaced, so the difference
	 * between small and medium is the same as the
	 * difference between medium and large.
	 */
	
	public boolean evenlySpaced(int a, int b, int c)
	{
		if((a-b == b-c)||(a-c == c-b)) {
			return true;
		} else if((b-a == a-c)||(b-c == c-a)) {
			return true;
		} else if((c-a == a-b)||(c-b == b-a)) {
		return true;
		} else {
		return false;
	}
}
}
