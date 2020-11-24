package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AraniaExumiaBlast {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int count = 0;
		while(stk.hasMoreTokens())
		{
			String s = stk.nextToken();
			s.toUpperCase();
			for(int i = 0; i < s.length(); i++)
			{
				if(i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1))
				{
					count++;
					break;
				}
			}
		}
		
		System.out.println(count);
	}

}
