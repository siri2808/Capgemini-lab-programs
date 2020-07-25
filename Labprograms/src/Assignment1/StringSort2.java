package Assignment1;

import java.util.Arrays;

public class StringSort2 {

	public static void main(String[] args) {
		String[] StringList= {"Java","Python","JavaScript","Angular"};
		Arrays.sort(StringList,(x,y)->Integer.compare(x.length(),y.length()));
		System.out.println(Arrays.deepToString(StringList));

	}

}
