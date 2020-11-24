package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class KillJeeAndSuperDromes {

	public static String toBinary(int n)
	{
		StringBuffer toReturn = new StringBuffer("");
		
		while(n > 0)
		{
			toReturn.append(n % 2);
			n /= 2;
		}
		toReturn.reverse();
		
		return toReturn.toString();
	}
	
	public static boolean isPalindrome(String s)
	{
		boolean toReturn = false;
		
		StringBuffer rev = new StringBuffer(s);
		rev.reverse();
		
		if(s.equals(rev.toString()))
			return true;
		
		return toReturn;
	}
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> arr = new ArrayList<>();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= 1000000; i++)
		{
			String forward = Integer.toString(i);
			
			if(isPalindrome(forward))
			{
				String binary = toBinary(i);
				if(isPalindrome(binary))
					arr.add(i);
			}
		}
		
		StringTokenizer stk = new StringTokenizer(br.readLine());
		while(stk.hasMoreTokens())
		{
			int N = Integer.parseInt(stk.nextToken());

			for(int i = 0; i < arr.size(); i++)
			{
				if(arr.get(i) == N)
				{
					System.out.println(i + 1);
					break;
				}
				else if(arr.get(i) > N)
				{
					System.out.println(i);
					break;
				}
				else if(i == arr.size() - 1)
					System.out.println(arr.size());
			}
		}
	}

}
