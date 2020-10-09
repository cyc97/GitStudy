package test;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double []array= {3,5,2,6,4};
		sort(array);
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}

	}
	public static void sort(double[] array)
	{
		int i,j;
		double temp;
		for(i=0;i<array.length-1;i++)//Ã°ÅÝ½µÐòÅÅÁÐ
		{
			for(j=0;j<array.length-1-i;j++)
			{
				if(array[j]<array[j+1])
				{
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
	}

}
