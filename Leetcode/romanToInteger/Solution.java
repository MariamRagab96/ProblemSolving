
package Leetcode.romanToInteger;


import java.util.*;


public class Solution {
    public int romanToInt(String s) {
     
        Map<Character,Integer> map=new HashMap<>();
        
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        int res=0;
        for(int i=0;i<s.length()-1;i++){
            int f=map.get(s.charAt(i));
            int l=map.get(s.charAt(i+1));
            if(i==s.length()-2){
                res+=f>=l?f+l:l-f;
            }else{
                res+=f>=l?f:-f;
            }
           } 
    return s.length()==1?map.get(s.charAt(0)):res;
    }
}