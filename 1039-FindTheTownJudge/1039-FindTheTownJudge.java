// Last updated: 5/26/2026, 11:18:04 AM
class Solution {
    public int findJudge(int n, int[][] trust) {
        //create trust rating array
        int[] t = new int[n+1];
        //iterate through temp array
        for (int i = 0; i < trust.length;i++){
        //person b trusts person a
        t[trust[i][1]]++;
        //person a trusts someone so can't be judge
        t[trust[i][0]]--;
        }
        //no judge edge case
        int result = -1;
        //iterate through array of trusts
        for (int i = 1; i <=n; i++){
            //if someones trust is n-1, they trust no one but everybody trusts them
            //they are the judge
            if (t[i] == n-1){
                result = i;
            }
       }
        return result;
    }
}