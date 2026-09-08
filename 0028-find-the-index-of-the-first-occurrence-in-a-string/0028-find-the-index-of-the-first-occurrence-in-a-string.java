class Solution {
    public int strStr(String haystack, String needle) {
        int i=0;
        boolean flag=false;

        for(int j=0; j<haystack.length();j++){
            if(haystack.charAt(j)==needle.charAt(i))
                i++;
        else{
            j=j-i;

            i=0;
        }

        if(i==needle.length()){
            flag=true;
            return(j-i+1);
        }
        }
        if (!flag){
           return -1;
        }
        return 0;
    }
}