package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FittingCircles {

	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int t = 0;
		while(t < T)
		{
			StringTokenizer stk = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(stk.nextToken());
			int b = Integer.parseInt(stk.nextToken());
			
			if(a == b)
				System.out.println(1);
			else if(a > b)
				System.out.println(a / b);
			else if(b > a)
				System.out.println(b / a);
			t++;
		}
	}

}
