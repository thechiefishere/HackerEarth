package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnEquililateralTriangle {

	public static int numOfRect(int a)
	{
		return (a * (a + 1)) / 2;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int totalRect = 0;
		for(int i = N - 2; i > 0; i--)
		{
			totalRect += numOfRect(i);
			if(N - i >= 4)
			{
				int diff = (N - (i + 4)) / 2;
				diff++;
				totalRect += (diff * (numOfRect(i)));
			}
		}
		
		System.out.println(totalRect);
	}

}
