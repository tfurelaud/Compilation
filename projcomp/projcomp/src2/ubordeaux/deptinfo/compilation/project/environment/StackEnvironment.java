package ubordeaux.deptinfo.compilation.project.environment;
import java.util.Stack;
import ubordeaux.deptinfo.compilation.project.type.*;

public class StackEnvironment {
	private Stack stack = new Stack();
	private String name; 
	
	public StackEnvironment (String s) {
		Stack<Type> stack = new Stack<Type>();
		this.stack = stack;
		this.name = s;
	}
	
	public int search(Object o) {
		return this.stack.search(o);
	}
	
	public Object peek() {
		return this.stack.peek();
	}
	
	public void pop() {
		this.stack.pop();
	}
	
	public void push(Object o) {
		this.stack.push(o);
	}
	
	public boolean isEmpty() {
		return this.stack.isEmpty();
	}
}
