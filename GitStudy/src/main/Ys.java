package main;

import java.util.ArrayList;
import java.util.Collections;

public class Ys {
void out(ArrayList arr) {
		Collections.sort(arr);
		Collections.reverse(arr);
		System.out.println("排序后结果：");
		for(int i=0;i<arr.size();i++)
		{
			int temp = (int)arr.get(i);
			System.out.print(temp+" ");
		}
		System.out.println("");
	}

}