class Solution {
    public boolean isAnagram(String s, String t) {
        /*
        HashMap<Character, Integer> m1=new HashMap<>();

        for(char ch: s.toCharArray())
         m1.put(ch,m1.getOrDefault(ch,0)+1);

        for(char ch: t.toCharArray())
         m1.put(ch,m1.getOrDefault(ch,0)-1);
        
        for(var v: m1.values()){
            if(v!=0)
             return false;
        }

    return true;
 */

 int[] a= new int[26];
for(int i=0;i<s.length();i++){
    char c=s.charAt(i);
    a[c-'a']++;
}
for(int i=0;i<t.length();i++){
    char c=t.charAt(i);
    a[c-'a']--;
}

for(int i=0;i<26;i++){
    if(a[i]!=0)
        return false;
}

return true;

    }
    
}

