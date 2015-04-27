public class TestMyStack{
	
	public static void main (String[] args){
		
		MyStack stack1 = new MyStack();
		
		stack1.push("e");
		stack1.push("n");
		stack1.push("y");
		stack1.push("a");
		stack1.push("W");
		
		
		MyStack stack2 = (MyStack)stack1.clone();
		
		stack2.push(" ");
		stack2.push("s");
		stack2.push("i");
		stack2.push(" ");
		stack2.push("e");
		stack2.push("m");
		stack2.push("a");
		stack2.push("N");
		stack2.push(" ");
		stack2.push("y");
		stack2.push("M");
		
		
		
		System.out.println("stack1 size :"+stack1.getSize());
		System.out.println("stack2 size :"+stack2.getSize());
		
		while(!(stack1.isEmpty())){
			System.out.println("stack1 : "+ stack1.pop());
		
		}
		
		System.out.println("\nWho ?\n");
		
		while(!(stack2.isEmpty())){
			
			System.out.println("stack2 : "+ stack2.pop());
		}
		System.out.println("\nOh~ OK!\n");
			
	}
}
