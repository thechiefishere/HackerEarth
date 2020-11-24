package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class NumOfArrays {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int t = 0;
		while(t < T)
		{
			StringTokenizer stk = new StringTokenizer(br.readLine());
			ArrayList<Integer> arr = new ArrayList<>();
			ArrayList<Integer> arrCopy = new ArrayList<>();
			
			int N = Integer.parseInt(stk.nextToken());
			int K = Integer.parseInt(stk.nextToken());
		    int Q = Integer.parseInt(stk.nextToken());
		    
		    stk = new StringTokenizer(br.readLine());
		    while(stk.hasMoreTokens())
		    	arr.add(Integer.parseInt(stk.nextToken()));
		    
		    arrCopy.addAll(arr);
		    Collections.sort(arrCopy);
		    
		    if(N == K || K > 2)
		    {
		    	if(arrCopy.get(0) < Q)
		    		System.out.println(arrCopy.get(0));
		    	else
		    		System.out.println("NO");
		    }
		    else if(K == 1)
		    {
		    	if(arrCopy.get(arrCopy.size() - 1) < Q)
		    		System.out.println(arrCopy.get(arrCopy.size() - 1));
		    	else
		    		System.out.println("NO");
		    }
		    else if(K == 2)
		    {	
		    	if(arr.get(0) < Q || arr.get(N - 1) < Q)
		    	{
		    		if(arr.get(0) <= arr.get(N - 1))
		    			System.out.println(arr.get(0));
		    		else
		    			System.out.println(arr.get(N - 1));
		    	}
		    	else
		    		System.out.println("NO");
		    	
		    	
		    }
		    
			t++;
		}
	}

}
