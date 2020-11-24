package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class CityGroup {
	
	private static boolean isDigitHere(int[] a, int x)
	{	
		ArrayList<Integer> misc = (ArrayList<Integer>) Arrays.stream(a).boxed().collect(Collectors.toList());
		misc.remove(0);
		if(misc.contains(x))
			return true;
		
		return false;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(stk.nextToken());
		int K = Integer.parseInt(stk.nextToken());
		int[] arr = new int[N + 1];
		
		for(int i = 0; i < K; i++)
		{
			stk = new StringTokenizer(br.readLine());
			int numOfCitiesInGroup = Integer.parseInt(stk.nextToken());
			
			while(stk.hasMoreElements())
				arr[Integer.parseInt(stk.nextToken())] = i + 1;
		}
		
		int Q = Integer.parseInt(br.readLine());
		int q = 0;
		while(q < Q)
		{
			stk = new StringTokenizer(br.readLine());
			int X = Integer.parseInt(stk.nextToken());
			int Y = Integer.parseInt(stk.nextToken());
			
			int xCity = arr[X];
			int yCity = arr[Y];
			
			
			if(xCity == yCity)
				System.out.println(0);
			else
			{
				int diff = xCity - yCity;
				if(diff < 0)
					diff *= -1;
				
				if(diff > (K - diff))
					System.out.println(K - diff);
				else
					System.out.println(diff);
			}
			q++;
		}
	}

}
