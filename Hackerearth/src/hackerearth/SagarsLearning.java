package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SagarsLearning {

	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int t = 0;
		
		while(t < T)
		{
			long N = Long.parseLong(br.readLine());
			if(N < 3)
				System.out.println(-1);
			else
			{
				long answer = N / 3;
				System.out.println(answer + " " + answer * 2 + " " + answer * 3);
			}
			
			t++;
		}
	}

}
