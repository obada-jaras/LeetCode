class Solution {
    public String predictPartyVictory(String senate) {
        int length = senate.length();
        Queue<Integer> rQ = new LinkedList<>();
        Queue<Integer> dQ = new LinkedList<>();
        
        for (int i = 0; i < length; i++) {
            char c = senate.charAt(i);
            if (c == 'R') rQ.add(i);
            else dQ.add(i);
        }
        
        while (!rQ.isEmpty() && !dQ.isEmpty()) {
            int rIndex = rQ.remove();
            int dIndex = dQ.remove();
            
            if (rIndex < dIndex) rQ.add(rIndex + length);
            else dQ.add(dIndex + length);
        }
        
        
        return (rQ.isEmpty()) ? "Dire" : "Radiant";
    }
}