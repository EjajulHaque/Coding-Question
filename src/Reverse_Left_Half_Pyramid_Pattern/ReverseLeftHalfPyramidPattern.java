package Reverse_Left_Half_Pyramid_Pattern;

class  Reverse_Right_Half_Pyramid_Pattern {
    public void leftHalfPyramid(){
        for (int i=1;i<=5;i++){
            for (int j=4;j>=i;j--){
                System.out.print(" ");
            }
            for (int k=5;k>=i;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class MainMethod6{
    public static void main(String[] args){
        Reverse_Right_Half_Pyramid_Pattern rf=new Reverse_Right_Half_Pyramid_Pattern();
        rf.leftHalfPyramid();
    }
}