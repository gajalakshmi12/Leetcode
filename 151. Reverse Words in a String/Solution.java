class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] strArr = s.split("\\s+");

        for(int i=strArr.length-1; i>=0; i--){
            sb.append(strArr[i]);
            if(i != 0){
                sb.append(" ");
            }
        }

        return sb.toString().trim();          
        
    }
}
