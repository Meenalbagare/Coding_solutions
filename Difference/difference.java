import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

	/*
	 * Complete the 'solution' function below.
	 * 
	 * The function is expected to return an INTEGER.
	 * The function accepts following parameters:
	 * 1. STRING S
	 * 2. STRING T
	 */


	public static int solution(String S, String T) {
		// Write your code here
		int c=0;
	
		for (int i=0;i<S.length();i++){
			if(S.charAt(i)!=T.charAt(i)){
				c+=1;
			}
		}
		return c;
		
	}
}

public class Source {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String S = bufferedReader.readLine();
		String T = bufferedReader.readLine();

		int result = Result.solution(S, T);

		System.out.print(String.valueOf(result));

		bufferedReader.close();	}
}