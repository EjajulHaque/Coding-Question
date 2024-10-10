package Left_Half_Pyramid_Pattern;

public class Left_Half_Pyramid_Pattern {
    public void leftHalfPyramid(){
        for (int i=1;i<=5;i++){
            for (int j=4;j>=i;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class MainMethod5{
    public static void main (String[] args){
            Left_Half_Pyramid_Pattern lp=new Left_Half_Pyramid_Pattern();
            lp.leftHalfPyramid();
    }
}