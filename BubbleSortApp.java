class Arraybub
	{
	private long[] a; 
	private int nElems;
	
	public ArrayBub(int max)
	{ 
		a = new long [max];
		nElems = 0;
	}
	public void insert(long value)
	{
		a[nElems] = value;
		nElems++;
	}
	
	public void display()
	{
		for(int j=0; j<nElems; j++)
			System.out.print(a[j] + " ");
		System.out.println(" ");
	}
	public void bubleSort()
	{
		int out, in, nElemsopp;


	// sorts regular	
	for(out=nElems-1; out>1; out--)
		for(out > in)
			if( a [out] < a[out-1])
				// swap from right to left
				temp = a[out-1];
				a[out-1] = a[out];
				a[out] = temp;
				
				
		/*
		  for(in=0; in<out; in++)
			if( a [in] > a[in+1])
				swap(in+1);
	
	// Sorts opposite
	for(out=nElems-1; out>1; out--)
		for(in=0; in<out; out++)
			if( a [out] < a[out-1])
				temp = a[out-1];
				a[out-1] = a[out];
				a[out] = temp;
	*/
	
	
	}
	
class BubbleSortApp
	{
	public static void main(String[] args)
		{
		int maxSize = 10000;
		ArrayBub arr;
		arr = mew ArrayBub(maxSize);
		
		for(int j=0; j<maxSize; j++)
		{
			long n = (long)( java.lang.Math.random()*(maxSize-1));
			arr.insert(n);
		}
		
		arr.insert(77);
		arr.insert(77);
		arr.insert(77);
		arr.insert(77);
		arr.insert(77);
		arr.insert(77);
		arr.insert(77);
		arr.insert(77);
		arr.insert(77);
			
		arr.display();
			
		arr.bubbleSort();
			
		arr.display();
		}
	}
		
	