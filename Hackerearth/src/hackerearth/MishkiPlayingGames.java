package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class MishkiPlayingGames {

	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> arr = new ArrayList<>();
		
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(stk.nextToken());
		int Q = Integer.parseInt(stk.nextToken());
		
		stk = new StringTokenizer(br.readLine());
		while(stk.hasMoreTokens())
			arr.add(Integer.parseInt(stk.nextToken()));
		
		
		for(int i = 0; i < Q; i++)
		{
			stk = new StringTokenizer(br.readLine());
			int L = Integer.parseInt(stk.nextToken());
			int R = Integer.parseInt(stk.nextToken());
			String nextPlayer = "M";
			int sum = 0;
			
			for(int j = L - 1; j < R; j++)
			{
				int presentNum = arr.get(j);
				sum = 0;
				
				if(presentNum <= 32)
				{
					for(int k = 1; k < 5; k++)
					{
						if(Math.pow(2, k) > presentNum)
						{
							sum += k;
							break;
						}
					}
				}
				else if(presentNum <= 1024)
				{
					for(int k = 6; k < 10; k++)
					{
						if(Math.pow(2, k) > presentNum)
						{
							sum += k;
							break;
						}
					}
				}
				else if(presentNum <= 32768)
				{
					for(int k = 11; k < 15; k++)
					{
						if(Math.pow(2, k) > presentNum)
						{
							sum += k;
							break;
						}
					}
				}
				else if(presentNum <= 1048576)
				{
					for(int k = 16; k < 20; k++)
					{
						if(Math.pow(2, k) > presentNum)
						{
							sum += k;
							break;
						}
					}
				}
				
				if(sum % 2 == 0)
				{
					if(nextPlayer.equals("M"))
						nextPlayer = "M";
					else
						nextPlayer = "H";
				}
				else
				{
					if(nextPlayer.equals("M"))
						nextPlayer = "H";
					else
						nextPlayer = "M";
				}	
			}
			
			if(nextPlayer.equals("M"))
				System.out.println("Hacker");
			else if(nextPlayer.equals("H"))
				System.out.println("Mishki");
		}
	}

}
