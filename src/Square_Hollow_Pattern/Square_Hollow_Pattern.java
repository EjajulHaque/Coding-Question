package Square_Hollow_Pattern;

public class Square_Hollow_Pattern {
    public void printStarProblem() {
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=5; j++) {
                if (i>=2 && j>=2 && i<=4 && j<=4){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();

        }
    }
}
 class MainMethod2 {
    public static void main(String[] args){
        Square_Hollow_Pattern ps=new Square_Hollow_Pattern();
        ps.printStarProblem();
    }

}