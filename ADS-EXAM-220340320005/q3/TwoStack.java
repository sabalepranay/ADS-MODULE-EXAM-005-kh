class TwoStack
{
int[] arr;
int size;
int Top1 ,Top2;



 TwoStack(int n)
  {
   size=n;
   arr=new int [n];
   Top1=n/2+1;
   Top2=n/2;
  }
  
 void push1(int x)
 {
  if(Top1>0)
  {
   Top1--;
   arr[Top1]=x;
   
  }
  else
  {
   System.out.print("Overflow");
   return;
  }
 } 
 
 void push2(int x)
 {
  if(Top2<size-1)
  {
   Top2++;
   arr[Top2]=x;
   
  }
  else
  {
   System.out.print("Overflow");
   return;
  }
 } 
 
 int pop1()
 {
 if (Top1<=size/2)
  {
   int x=arr[Top1];
   Top1++;
   return x;
   }
   else
   {
    System.out.print("underflow");
   }
   return 0;
  }
 
 int pop2()
 {
 if (Top2>=size/2+1)
  {
   int x=arr[Top2];
   Top2--;
   return x;
   }
   else
   {
    System.out.print("underflow");
   }
   return 1;
  }
  
  
  public static void main(String[] args)
   {
     TwoStack TS=new TwoStack(5);
	 TS.push1(5);
	  TS.push2(10);
	   TS.push2(15);
	    TS.push1(11);
		 TS.push2(7);
		  TS.push2(40);
    System.out.print(" Popped element from stack1 is "+TS.pop1);
	System.out.print("Popped element from stack2 is  "+TS.pop2);
	
   }
  
}