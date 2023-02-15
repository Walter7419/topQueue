
public class Queue {
	char[] stack;
	int max;
	int top;
	
	
	public Queue(int stackSize) {
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
	
	public char queue() {
		if(top==0) {
			System.out.println("Stack is empty");
			return(0);
		}
		else {
		char primer=stack[0];
		for(int n=0; n<max-1; n++) {
			stack[n]=stack[n+1];
		}
		top--;
		return primer;
		}
	}
}
