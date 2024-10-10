package Right_Half_Pyramid_Pattern;

public class Right_Half_Pyramid_Pattern {
    public void rightHalfPyramid(){
        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class MainMethod1 {
    public static void main(String[] args){
        Right_Half_Pyramid_Pattern rf=new Right_Half_Pyramid_Pattern();
        rf.rightHalfPyramid();
    }
}
