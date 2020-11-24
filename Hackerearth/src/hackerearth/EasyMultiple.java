package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EasyMultiple {

	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int t = 0;
		
		while(t < T)
		{
			int N = Integer.parseInt(br.readLine());
			double sum = 0;
			long sum1 = 0;
			long sum2 = 0;
			long sum3 = 0;
			
			int a = 3;
			int d = 3;
			int n =  ((N - 1) / 3);
			double part1 = (double)n / 2d;
			long part2 = 2 * a;
			long part3 = n - 1;
			long part4 = part3 * d;
			long part5 = part2 + part4;
			double part6 = part1 * part5;
			sum1 += part6;

			if(N > 5)
			{
				 a = 5;
				 d = 5;
				 n =  ((N - 1) / 5);
				 part1 = (double)n / 2d;
			     part2 = 2 * a;
				 part3 = n - 1;
			     part4 = part3 * d;
				 part5 = part2 + part4;
				 part6 = part1 * part5;
				 sum2 += part6;
			}
			
			if(N > 15)
			{
				a = 15;
				d = 15;
				n =  ((N - 1) / 15);
				part1 = (double)n / 2d;
			    part2 = 2 * a;
				part3 = n - 1;
			    part4 = part3 * d;
				part5 = part2 + part4;
				part6 = part1 * part5;
				sum -= part6;
				sum3 += part6;
			}
			
			System.out.println(sum1 + sum2 - sum3);
			t++;
		}
	}

}
