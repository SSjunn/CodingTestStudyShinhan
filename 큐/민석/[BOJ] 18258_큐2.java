import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        int last = -1;   // back 명령용 (Queue에는 뒤 접근 메서드가 없음)

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            switch (str) {
                case "push":
                    last = Integer.parseInt(st.nextToken());
                    queue.offer(last);
                    break;

                case "pop":
                    if (queue.isEmpty()) sb.append(-1);
                    else sb.append(queue.poll());
                    sb.append('\n');
                    break;

                case "size":
                    sb.append(queue.size()).append('\n');
                    break;

                case "empty":
                    sb.append(queue.isEmpty() ? 1 : 0).append('\n');
                    break;

                case "front":
                    if (queue.isEmpty()) sb.append(-1);//큐비어있으면 -1
                    else sb.append(queue.peek()); //가장앞에있는 정수 출력
                    sb.append('\n');
                    break;

                case "back":
                    if (queue.isEmpty()) sb.append(-1);//큐비어있으면 -1
                    else sb.append(last);//가장 뒤에있는 
                    sb.append('\n');
                    break;
            }
        }

        System.out.print(sb);
    }
}