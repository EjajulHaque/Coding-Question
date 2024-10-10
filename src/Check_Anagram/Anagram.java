package Check_Anagram;

import java.util.Arrays;

public class Anagram {
    public boolean checkStringIsAnagram(String s1, String s2){
        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if (Arrays.equals(ch1,ch2)){
            return true;
    }else {
            return false;
        }
    }
}
class MainMethod9{
    public static void main(String[] args){
        Anagram a=new Anagram();
        String s1="silent";
        String s2="listen";
       boolean result=a.checkStringIsAnagram(s1,s2);
        System.out.println(result);
    }
}
