public class Triangle {
    public static boolean triangle (int a, int b, int c){
        if ((a+b)<=c||(a+c)<b||(c+b)<a){
            return false;
        }
    return true;
    }
    public static String triangleClassifi(int a, int b, int c){
            final String TAM_GIAC_CAN = "Tam giác cân";
            final String TAM_GIAC_THUONG = "Tam giác thường";
            final String TAM_GIAC_DEU = "Tam giác đều";
            final String TAM_GIAC_VUONG = "Tam giác vuông";
            final String NOT_TAM_GIAC ="Không phải tam giac";
        if (triangle(a, b, c)==true){
            if (a==b&&a!=c || a==c&&a!=b || b==c&&b!=a){
                return TAM_GIAC_CAN ;
            }if (a==b&&b==c){
                return TAM_GIAC_DEU;
            }if (a*a==b*b+c*c||b*b==a*a+c*c||c*c==a*a+b*b){
                return TAM_GIAC_VUONG;
            }else {
                return TAM_GIAC_THUONG;
            }
        }
        return NOT_TAM_GIAC;
    }
}
