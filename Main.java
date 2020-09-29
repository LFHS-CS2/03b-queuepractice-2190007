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
			Queue<Integer> x = q;
			int wow;
				for(int i = q.size(); i > 0; i--){
					q[i] = null;
				}
        for(int i = x.size(); i> 0; i--){
					wow = x(i);
					for(int j = 0; j < x.size(); j++){
						if((x(j) != null) && (wow > x(j))){
							wow = x(j);
							x(j) = null;
						}
					}
					q.add(wow);
						
				}

    }


}
