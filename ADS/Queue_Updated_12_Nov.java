package Lecture;

class Queue1
{
   int front,rear;
   int[] q=new int[5];
   Queue1()
   {
	  front=rear=-1; 
   }
   
   void insert(int x)
   {
	   if(front==0 &&rear==q.length-1)
	   {
		  System.out.println("Queue is full"); 
	   }
	   else if(front==-1 && rear==-1)
	   {
		   front=rear=0;
		   q[rear]=x;
		   System.out.println("inserted ele"+q[rear]+"raer ind"+rear);
	   }
	   else if(rear==q.length-1 && front!=0)
	   {
		   rear=0;
		   q[rear]=x;
		   System.out.println("inserted ele"+q[rear]+"raer ind"+rear);
	   }
	   else
	   {
		   rear++;
		   q[rear]=x;
		   System.out.println("inserted ele"+q[rear]+"raer ind"+rear);

	   }
   }
   
   int delete()
   {
	   int val;
	   if(front==-1 && rear==-1)
	   {
		   System.out.println("Under flow");
		   return -1;
	   }
	   val=q[front];
	   System.out.println("deleted ele"+val+"front ind "+front);

	   if(front==rear)
	   {
		   System.out.println("front ind "+front);

		   front=rear=-1;
		   System.out.println("front ind "+front);

	   }
	   else
	   {
		   if(front==q.length)
		   {
			   front=0;
		   }
		   else
		   {
			   front++;
		   }
	   }
	   return val;
   }
 
}
public class Queue_Updated_12_Nov {

	public static void main(String[] args) {
		Queue1 q=new Queue1();
		q.insert(10);
		q.insert(20);
		q.insert(30);
		//q.insert(40);
		//q.insert(50);
		//q.insert(60);
		System.out.println(q.delete());;
		System.out.println(q.delete());;
		System.out.println(q.delete());;
		//System.out.println(q.delete());;
		//System.out.println(q.delete());;
		//System.out.println(q.delete());;
		q.insert(60);
		System.out.println(q.delete());;

    }
}
