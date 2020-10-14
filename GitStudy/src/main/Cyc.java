package main;

import java.util.ArrayList;

public class Cyc {
void out(ArrayList arr) {
	int sum=0;
	for(int i=0;i<arr.size();i++){
		sum+=(int)arr.get(i);
	}
	System.out.println("平均值为："+sum/arr.size());
	}

}
