package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ShittyFortune {

	public static boolean isPalindrome(String s)
	{
		boolean toReturn = false;
		
		StringBuffer rev = new StringBuffer(s);
		rev.reverse();
		
		if(s.equals(rev.toString()))
			return true;
		
		return toReturn;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int t = 0;
		while(t < T)
		{
			StringTokenizer stk = new StringTokenizer(br.readLine());
			String s = "";
			int K = 1;
			if(stk.countTokens() > 1)
			{
				s = stk.nextToken();
				K = Integer.parseInt(stk.nextToken());
			}
			else
			{
				System.out.println("NO");
				continue;
			}
			
			int sSize = s.length();
			int div = sSize / K;
			boolean done = false;
			
			if(sSize % K != 0)
				System.out.println("NO");
			else
			{
				for(int i = 0; i < sSize; i += div)
				{
					String sub = s.substring(i, (i + div));
					if(!isPalindrome(sub))
					{
						System.out.println("NO");
						done = true;
						break;
					}
				}
				if(!done)
					System.out.println("YES");
				
			}
			
			t++;
		}
	}

}
