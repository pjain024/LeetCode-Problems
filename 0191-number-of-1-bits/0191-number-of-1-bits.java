class Solution {
    public int hammingWeight(int n) {
        int count=0;
        for(int i=0;i<=30;i++){
            if((1 & (n>>i)) != 0){
                count++;
            }
        }
        return count;
    }
}
/*
10
0001
0010
0100
1000 */