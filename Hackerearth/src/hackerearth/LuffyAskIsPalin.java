package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LuffyAskIsPalin {

	public static boolean palindromePossible(String s)
	{
		int itsOdd = 0;
		
		for(int i = 97; i <= 122; i++)
		{
			char alph = (char) i;
			int counter = 0;
			for(int j = 0; j < s.length(); j++)
				if(Character.compare(s.charAt(j), alph) == 0)
					counter++;
			
			if(counter % 2 != 0)
				itsOdd++;
			
			if(itsOdd > 1)
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int t = 0;
		while(t < T)
		{
			StringTokenizer stk = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(stk.nextToken());
			int Q = Integer.parseInt(stk.nextToken());
			
			String S = br.readLine();
			for(int i = 0; i < Q; i++)
			{
				stk = new StringTokenizer(br.readLine());
				int L = Integer.parseInt(stk.nextToken());
				int R = Integer.parseInt(stk.nextToken());
				String subString = S.substring(L - 1, R);
				if(palindromePossible(subString))
					System.out.println("YES");
				else
					System.out.println("NO");
			}
			
			
			t++;
		}
	}

}
