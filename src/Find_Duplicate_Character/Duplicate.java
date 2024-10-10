package Find_Duplicate_Character;

public class Duplicate {
    public char findDuplicateInString(String s){
        int count=0;
        char[] ch=s.toCharArray();
        for (int i=0;i<ch.length;i++){
            for (int j=i+1;j<ch.length;j++){
                if (ch[i]==ch[j]){
                    System.out.println("Duplicate character in String:"+ch[j]);
                    count++;
                }
            }
        }
        System.out.println("Duplicate character count:"+count);
        return (char) count;
    }
}
class MainMethod7{
    public static void main(String[] args){
        Duplicate d=new Duplicate();
        String s="welcomeinjungle";
        d.findDuplicateInString(s);
    }
}