class Insertion
{  
  void printarray(int arr1[])
  {
    int n=arr1.length;  
  for(int i=0; i<n;i++)
	 {
	  System.out.print(arr1[i]+" ");
	  }
	 System.out.println(" ");
  }
  void insertionsort(int arr[]){
    int n=arr.length;  
	for (int i=4;i>=0;i--)
     {
      int temp=arr[i];
	  int j =i-1;
	  while(j>=0 && arr[j]>temp)
	  {
	    arr[j+1]=arr[j];
		printarray(arr);
		j=j-1;
	   }
	   arr[j+1]=temp;
     }
  printarray(arr);
  }
 public static void main(String[] args)
 {
    Insertion i=new Insertion();
   int a1[]={2,4,6,8,3};
   i.insertionsort(a1);
 }
}