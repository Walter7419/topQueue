
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pop stack = new Pop(5);
		stack.Push('l');
		stack.Push('h');
		stack.Push('r');
		stack.Push('t');
		stack.Push('x');

		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());


	}

}
