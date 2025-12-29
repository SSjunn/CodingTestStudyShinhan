// class Solution {
//     public int[] solution(int brown, int yellow) {
//         int[] answer = {};
        
//         int sum = brown + yellow;
        
//         //행과 열로 장난질을 치네 ?
//         //sum은 주어져있으니까
//         //그걸로 열과행을 계속 변동을 줘서 반복을 시키고
//         // 주어진값과 일치하면 return
        
//         //근데 반복문 어떻게 할건데..
        
//         //가로길이가 세로길이보다 같거나 큼 N >= M
//         double Ns = Math.sqrt(sum); //제곱근 구하기
//         int N = (int)Ns;
        
//         //흠.....시간없어서  다시 풀어보겠습니다..
        
        
//         return answer;
//     }
// }

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        
        answer = new int[2];
        //brown이 돌아들어가는거 
        //yellow가 내용물 
        //일단 행 * 열이 brown + yellow
        //
        int sum = brown + yellow;
        
        //일단 행과열 되는거 다해봐 
        // yellow가 되는건 정해져있으니까
        //경우에만 맞으면 바로 return 하면되지 
        
        for(int i =3;i < sum /2 ;i++){
            
            if(sum % i ==0 ){ 
                
                int row = i; //세로 
                int col = sum / i; //가로 
                
                if(col >= row) { 
                    
                    if ((row - 2) * (col - 2) == yellow){
                        
                        answer[0] = col;
                        answer [1] = row;
                        return answer;
                    }
                    
                    
                    
                    
                } //가로가 세로보다 길때만
                    
                    
                }
                
                
            }
        
        
            return answer;
        }
        
}