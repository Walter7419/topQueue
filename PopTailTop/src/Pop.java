
public class Pop {
	char[] stack;
	int max;
	int top;
	
	public Pop(int stackSize) {
		this.stack=new char[stackSize];
		max=this.stack.length;
		this.top=0;
	}
	
	public void Push(char value) {
		if(top==max) {
			System.out.println("No se admiten mas");
			return;
		}
		stack[top]=value;
		top++;
	}

	
//	
	
	public char pop() {
		if (top==0)
		{
			System.out.println("Stack is empty");
			return(stack[top]);
		}
		else {
			char pos=stack[top-1];
			stack[top-1]=0;
			top--;
			return(pos);
		}
	}
	
}
