class Solution {
    private Set<String> visited = new HashSet<>();
    
    public int openLock(String[] deadends, String target) {
        if (target == null || target.length() == 0) return -1;
        
        
        for (String deadend: deadends)
            visited.add(deadend);
        
        Queue<String> q = new LinkedList<>();
        int level = 0;
        q.offer("0000");
        
        while (!q.isEmpty()){
            int qSize = q.size();
            
            while (qSize-- > 0) {
                String curr = q.poll();

                if (visited.contains(curr)) continue;
                if (curr.equals(target)) return level;
                
                for (String nextState: getNextsStates(curr)){
                    q.offer(nextState);
                }
                visited.add(curr);
            }
            level++;        
        }
        
        return -1;
    }
    
    
    private Set<String> getNextsStates(String str) {
        Set<String> set = new HashSet<>();
        char[] allChars = str.toCharArray();
        
        for (int i = 0; i < 4; i++) {
            char c = allChars[i];
            
            allChars[i] = (c == '9') ? '0' : (char) (c+1);
            if (!visited.contains(new String(allChars)))
                set.add(new String(allChars));

            allChars[i] = (c == '0') ? '9' : (char) (c-1);
            if (!visited.contains(new String(allChars)))
                set.add(new String(allChars));
            
            allChars[i] = c;
        }
        return set;
    }
}