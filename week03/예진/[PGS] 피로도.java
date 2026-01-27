class Solution {
    
    int answer;
    
    public int solution(int k, int[][] dungeons) {
        answer = -1;
        
        // ["최소 필요 피로도", "소모 피로도"]
        // 유저가 탐험할수 있는 최대 던전 수
        
        // 완전탐색
        // DFS + 백트래킹으로 모든 경우의 수를 탐색
        // 가지치기 -> 피로도 안되면 바로 건너뛰기
        dfs(k, new boolean[dungeons.length], dungeons, 0, 0);
        
        return answer;
    }
    
    private void dfs(int energy, boolean[] visited, int[][] map, int depth, int max) {
        if(depth == map.length) {
            answer = Math.max(max, answer);
            return;
        }    
        
        for(int i = 0; i < visited.length; i++) {
            if(visited[i] == false && energy >= map[i][0]) {        // 가지치기
                visited[i] = true;
                dfs(energy - map[i][1], visited, map, depth + 1, max + 1);
                visited[i] = false;     // 백트래킹
            } 
        }
        
        answer = Math.max(max, answer);
        
        return;
        
    }
}