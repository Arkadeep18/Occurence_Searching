package nothing;
import java.util.*;
public class Occurence {

	public static int occurence(String str,char ch) {
		int count=0;
		for(int a=0;a<str.length();a++) {
			if(ch == str.charAt(a)) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		System.out.println("Enter the character");
		char ch = sc.next().charAt(0);
		
		System.out.println(occurence(str, ch));
	}

}

