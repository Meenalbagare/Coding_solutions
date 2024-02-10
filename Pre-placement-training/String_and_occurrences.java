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
	 * Complete the 'solve' function below.
	 * 
	 * The function is expected to return an INTEGER.
	 * The function accepts following parameters:
	 * 1. STRING S
	 * 2. CHARACTER A
	 * 3. CHARACTER B
	 */


	public static int solve(String S, char A, char B) {
		// Write your code here
		int startt=0;
		int endd=0;
		for(int i=0;i<S.length();i++){
			if(S.charAt(i)==A){
				startt=i;
				break;
			}
			for(int j=0;j<S.length();j++){
				if(S.charAt(j)==A){
					endd=Math.max(j,endd);
				}
			}
		}
		String s=S.substring(startt,endd+1);
		if(s.indexOf(B)!=-1){
			return s.length();
		}
		return -1;
		
		
	}
}

public class Source {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String S = bufferedReader.readLine();
		char A = bufferedReader.readLine().charAt(0);
		char B = bufferedReader.readLine().charAt(0);

		int result = Result.solve(S, A, B);

		System.out.print(String.valueOf(result));

		bufferedReader.close();	}
}