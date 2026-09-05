class Solution {
    public boolean checkInclusion(String target, String source) {
        if(source.length()<target.length()){
            return false;
        }
        int[] map1=new int[26];
        int[] map2=new int[26];

        for(int i=0;i<target.length();i++){
            map1[target.charAt(i)-'a']++;
             map2[source.charAt(i)-'a']++;
        }
        int left=0,right=target.length();
        while(right<source.length()){
            
             
            if(isValid(map1,map2)==true){
                 return true;
            }
             map2[source.charAt(left)-'a']--;
             map2[source.charAt(right)-'a']++;
            right++;
            left++;
           
           

        }
        if(isValid(map1,map2)==true){
                 return true;
            }
        return false;
        
    }

    public  boolean isValid(int[] map1 ,int[] map2){
        for(int i=0;i<map2.length;i++){
            if(map2[i]!=map1[i]){
                return false;
            }
        }
        return true;
    }
}