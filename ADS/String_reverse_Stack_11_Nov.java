package Lecture;

class MyStack4
{
	private int max=100;
	int top;
	
	char[] stack=new char[max];
	public MyStack4()
	{
		
		top =-1;
		
	}

	void push(char x)
	{
		if(top>=max-1)
		{
			System.out.println("Stack overflow");
			
		}
		else
		{
			top++;
			stack[top]=x;
			System.out.println(x+" "+top);
		}
	}
	
	char pop()
	{
		
		if(top<0)
		{
			System.out.println("STack underflow");
			return ' ';
		}
		else 
		{
			char ch1= stack[top];
			 top--;
			return ch1;
		}
	}
	
	boolean isEmpty()
	{
		if(top<0)
		{
			//System.out.println("Stack is empty");
		     return true;
		}
		else
		{
			//System.out.println("Stack is not empty");
	        return false;
		}
	}
}

class String_rev
{
	String str=" ";
	MyStack4 s;
	String_rev()
	{
	 str="Pratima";	
	 int n=str.length();
	 s=new MyStack4();
	}
	
	void reverse()
	{
		for(int i=0;i<str.length();i++)
		{
			s.push(str.charAt(i));
		}
		for(int i=0;i<str.length();i++)
		{
			char s1=s.pop();
			System.out.print(s1);
			//System.out.println("reversed string is :"+s1);;
		}
		
	}
}

public class String_reverse_Stack_11_Nov {

	public static void main(String[] args) {
		String_rev s=new String_rev();
		s.reverse();

	}

}
