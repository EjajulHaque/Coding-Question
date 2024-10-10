package Reverse_Right_Half_Pyramid_Pattern;

public class Reverse_Right_Half_Pyramid_Pattern {
    public void reverseRightHalfPyramid(){
        for (int i=1;i<=5;i++){
            for (int j=5;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class MainMethod4{
    public static void main(String[] args){
        Reverse_Right_Half_Pyramid_Pattern reverse=new Reverse_Right_Half_Pyramid_Pattern();
        reverse.reverseRightHalfPyramid();
    }
}