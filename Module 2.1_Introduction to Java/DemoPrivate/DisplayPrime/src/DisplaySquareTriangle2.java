public class DisplaySquareTriangle2 {
    public static void main(String[] args) {
        int row;
        int col;
        for (row=5;row>=1;row--){
            for (col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
