package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class ShillAndSurvivalGame {

	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> arr = new ArrayList<>();
		ArrayList<Integer> answerArr = new ArrayList<>();
		//ArrayList<Integer> answerArrArr = new ArrayList<>();
		int biggestNum = 0;
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int n = 1;
		while(stk.hasMoreTokens())
		{
			int S = Integer.parseInt(stk.nextToken());
			if(S > biggestNum)
			{
				answerArr.add(n);
				biggestNum = S;
				//answerArrArr.add(biggestNum);
			}
			
			arr.add(S);
			n++;
		}
		
		biggestNum = arr.get(arr.size() - 1);
		for(int i = arr.size() - 1; i >= 0; i--)
		{
			if(arr.get(i) > biggestNum)
			{
				biggestNum = arr.get(i);
				if(answerArr.lastIndexOf(i + 1) == -1)
				{
					answerArr.add(i + 1);
					biggestNum = arr.get(i);
					//answerArrArr.add(biggestNum);
				}
			}
		}
		answerArr.add(N);
		//answerArrArr.add(arr.get(N - 1));
		
		Collections.sort(answerArr);
		
		for(int i = 0; i < answerArr.size(); i++)
			System.out.print(answerArr.get(i) + " ");
		
		
	}

}
