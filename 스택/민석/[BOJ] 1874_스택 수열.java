import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main{
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
	public static void main(String []args) throws Exception{
		
		
		
		
		Stack<Integer> stack = new Stack<>();
//		push X: 정수 X를 스택에 넣는 연산이다.
//		pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다.  스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//		size: 스택에 들어있는 정수의 개수를 출력한다.
//		empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
//		top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		int T = Integer.parseInt(br.readLine());
		int[] arr = new int[T]; //숫자 기억
		for(int i = 0 ;i<T;i++) {
			arr[i] = Integer.parseInt(br.readLine());
			
		}
		
		
		//arr[i]하나씩 검사
		//만약 스택에 위에 있는게 arr[i]와 같으면 pop
		//스택에 위에 있는게 arr[i]보다 크면 no
		//스택에 위에 있는게 arr[i] 보다 작으면 arr[i]와 같아질때까지 pusg
		StringBuilder sb = new StringBuilder();
	
		int cur = 1;
		int last = 0;
		for(int i = 0 ; i< T;i++) {
			int want = arr[i];
			
			if(!stack.contains(want)) {
				
				for(int j = cur;j<=want;j++) {
					
					
					sb.append("+\n");
					stack.push(j);
					last = j;
				}
				cur = last + 1;
				stack.pop();
				sb.append("-\n");
				
			}
			else {   //want를 가지고 있어 이미 스택이
				
				if(stack.peek() == want) {
					stack.pop();
				    sb.append("-\n");
				}
				else {
					bw.write("NO");
					bw.flush();
					bw.close();
					return;
				}
				
				
			}
			
			
		
			
			
		}
		bw.write(sb.toString());
		
		
		
		
		
		bw.flush();
		bw.close();
		
		
		
	}
}