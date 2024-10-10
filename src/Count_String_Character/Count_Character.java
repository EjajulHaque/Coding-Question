package Count_String_Character;

public class Count_Character {
    public int countOccuranceOfCharacterInString(String s) {
        System.out.println("character/occurance");
        int count = 0;
        for (char c = 'a'; c <='z'; c++) {
            count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c) {
                    count++;
                }
            }
            if (count!=0)
            System.out.println(c + "           " + count);
        }
        return count;
    }
}
class MainMethod8{
    public static void main(String[] args){
        Count_Character c=new Count_Character();
        String S="welcometojava";
        c.countOccuranceOfCharacterInString(S);
    }
}