package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ImageSmoothing {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(stk.nextToken());
		int M = Integer.parseInt(stk.nextToken());
		int mMax = 2 * M + 1;
		
		int[][] arrM = new int[mMax][mMax];
		int[][] arrN = new int[N][N];
		int[][] smoothedArr = new int[N][N];
		
		for(int i = 0; i < mMax; i++)
		{
			stk = new StringTokenizer(br.readLine());
			for(int j = 0; j < mMax; j++)
				arrM[i][j] = Integer.parseInt(stk.nextToken());
		}
		for(int i = 0; i < N; i++)
		{
			stk = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++)
				arrN[i][j] = Integer.parseInt(stk.nextToken());
		}
		
		int inc = 1;
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < N; j++)
			{
				//System.out.println("\n");
				int k = i - M;
				if(k < 0)
					k = 0;
				int kLimit = i + M;
				if(kLimit >= N)
					kLimit = N - 1;
				int p = 0;
				if(i - M < 0)
					p = Math.abs(i - M);
				
				int sum = 0;
				for(; k <= kLimit; k++, p++)
				{
					int l = j - M;
					if(l < 0)
						l = 0;
					int lLimit = j + M;
					if(lLimit >= N)
						lLimit = N - 1;
					
					int q = 0;
					if(j - M < 0)
						q = Math.abs(j - M);
					
					for(; l <= lLimit; l++, q++)
					{
						//System.out.println("arrN[" + k + "][" + l + "] =" + arrN[k][l]);
						//System.out.println("arrM[" + p + "][" + q + "] =" + arrM[p][q]);
						sum += (arrN[k][l] * arrM[p][q]);
						if(q + 1 == mMax)
							break;
					}
					if(p + 1 == mMax)
						break;
				}
				
				//System.out.println("For element = " + inc + " sum = " + sum);
				smoothedArr[i][j] = sum;
				//inc++;
			}
		}
		
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < N; j++)
				System.out.print(smoothedArr[i][j] + " ");
			
			System.out.println();
		}
	}

}
