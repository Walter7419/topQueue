
public class MainQueue {

	public static void main(String[] args) {
		Queue stack = new Queue(5);
		stack.Push('l');
		stack.Push('h');
		stack.Push('r');
		stack.Push('t');
		stack.Push('x');
		
		System.out.println(stack.queue());
		System.out.println(stack.queue());
		System.out.println(stack.queue());
		System.out.println(stack.queue());
		System.out.println(stack.queue());
		System.out.println(stack.queue());
		System.out.println(stack.queue());

	}

}
