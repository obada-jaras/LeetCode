class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stk = new Stack<>();
        
        for (int i = 0; i < tokens.length; i++) {
            if (isNumeric(tokens[i]))
                stk.push(tokens[i]);
            
            else {
                int n1 = Integer.parseInt(stk.pop());
                int n2 = Integer.parseInt(stk.pop());
                
                int tempResult = 0;
                if (tokens[i].equals("+"))
                    tempResult = n2 + n1;
                
                else if (tokens[i].equals("-"))
                    tempResult = n2 - n1;
                
                else if (tokens[i].equals("*"))
                    tempResult = n2 * n1;
                
                else if (tokens[i].equals("/"))
                    tempResult = n2 / n1;
                
                stk.push(tempResult + "");
            }
        }
        
        return Integer.parseInt(stk.pop());
    }
    
    
    
    public static boolean isNumeric(String str) { 
        try {  
            Integer.parseInt(str);  
            return true;
            
        } catch(NumberFormatException e){  
            return false;  
        }  
    }
}