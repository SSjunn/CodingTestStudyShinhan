import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};

        int len = answers.length;

        int[] A = {1,2,3,4,5};  // 5
        int[] B = {2,1,2,3,2,4,2,5};  // 8
        int[] C = {3,3,1,1,2,2,4,4,5,5};  // 10

        int aCnt=0,bCnt=0,cCnt=0;

        for (int i = 0; i < len; i++) {
            if(answers[i]==A[i%5]) {
                aCnt++;
            }
            if(answers[i]==B[i%8]) {
                bCnt++;
            }
            if(answers[i]==C[i%10]) {
                cCnt++;
            }
        }
        List<Integer> list = new ArrayList<>();
        int max =Math.max(aCnt,Math.max(bCnt,cCnt));
        if(max==aCnt){
            list.add(1);
        }
        if(max==bCnt){
            
            list.add(2);
        }
        if(max==cCnt){
            
            list.add(3);
        }
        
        
        answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
     

        
        
        
        
        
        return answer;
    }
}
