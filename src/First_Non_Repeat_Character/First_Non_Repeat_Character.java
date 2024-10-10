package First_Non_Repeat_Character;

public class First_Non_Repeat_Character {
    public char firstNonRepeatCharacter(String s){
        char c=' ';
        for (int i=0;i<s.length();i++){
            for (int j=i+1;j<s.length();j++){
                if (s.charAt(i)!=s.charAt(j)){
                    c=s.charAt(i);
                }
            }
            if (c>1) {
                System.out.println("firstNonRepeatCharacter:" + c);
                break;
            }
        }
        return c;
    }
}
class Main{
    public static void main(String[] args){
        First_Non_Repeat_Character f=new First_Non_Repeat_Character();
        String s="welcome in jungle";
        f.firstNonRepeatCharacter(s);
    }
}