import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args)  {
       TestMain test = new TestMain();
       test.main(null);
    }
    
    /**
     * See Readme.md
     * IMPORTANT: You may use only a single Stack as auxiliary storage. 
     */
    public static void reorder(Queue<Integer> q) 
    {
			Stack<Integer> stack = new Stack<Integer>();
			int length = 0;
			while(!q.isEmpty()){
				length++;
				stack.push(q.remove());
			}
			while(!stack.isEmpty()){
				q.add(stack.pop());
			}
			for(int i = 0; i<length; i++){
				if(q.peek()>= 0){
					stack.push(q.remove());
				} else {
					q.add(q.remove());
				}
			}
			while(!stack.isEmpty()){
				q.add(stack.pop());
			}
    }


}
