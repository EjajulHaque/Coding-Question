package Square_Fill_Pattern;

public class Square_Fill_Pattern {
    public void squareFill(){
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class MainMethod3 {
    public static void main(String[] args){
        Square_Fill_Pattern sf=new Square_Fill_Pattern();
        sf.squareFill();
    }
}