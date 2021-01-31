package Lecture;

class MyStack3<T>
{
	private int max=100;
	int top;
	char[] stack=new char[max];
	
	public MyStack3()
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
			System.out.println("Pushed cahracter is : "+stack[top]);
		}
	}
	
	void pop()
	{
		char item;
		if(top<0)
		{
			System.out.println("STack underflow");
			
		}
		else 
		{
			 item=stack[top];
			 System.out.println("Popped chara : "+item);
			 top--;
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
	
	public char peek()
	{
		if(top<0)
		{
			
			//System.out.println("Error : top on empty stack");
	        return ' ';
		}
		else
		{
			return stack[top] ;
		}
	}

}

class Para_Bracket
{
	String str=" ";
	MyStack3 s;
	Para_Bracket()
	{
		str="{}] ";
		s=new MyStack3();
	}
	
	void paramatching()
	{
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='{'||str.charAt(i)=='[' ||str.charAt(i)=='(')
			{
			  s.push(str.charAt(i));	
			}
			else if(!s.isEmpty() && 
					(str.charAt(i)=='}' && s.peek() == '{') ||
					(str.charAt(i)==']' && s.peek() == '[') ||
					(str.charAt(i)==')' && s.peek() == '(')
					)
			{
				
				s.pop();
			}
			else
				s.push(str.charAt(i));
				
		}
		if(s.isEmpty())
		{
			System.out.println("Balanced");
		}
		else
		{
			System.out.println("Not balanced ");

		}
	}
}
public class Stack_Para_Bracket_11_Nov {

	public static void main(String[] args) 
	{
		Para_Bracket p=new Para_Bracket();
		p.paramatching();
	}

}
