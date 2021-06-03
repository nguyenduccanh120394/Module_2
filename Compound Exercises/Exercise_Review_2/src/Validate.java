import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    public static final String ID_REGEX =  "^[C]{1}[0-9]{4}[GHIK]{1}[0-9]{2}$";//Cxxxx[G|H|I|K]xx
    public static final String EMAIL_REGEX =  "^[a-zA-Z]*.[a-zA-Z0-9]*@[c][o][d][e][g][y][m][.][v][n]$";//tên.họ@codegym.vn
        public static final String DATEOFBIRTH_REGEX =  "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$";//DD-MM-YYYY
    private static Pattern pattern;
    private static Matcher matcher;
    public Validate(){}
    static boolean validateId(String regex){
        pattern=Pattern.compile(ID_REGEX);
        matcher= pattern.matcher(regex);
        return matcher.matches();
    }
    static boolean validateEmail(String regex){
        pattern=Pattern.compile(EMAIL_REGEX);
        matcher= pattern.matcher(regex);
        return matcher.matches();
    }
    static boolean validateDate(String regex){
        pattern=Pattern.compile(DATEOFBIRTH_REGEX);
        matcher= pattern.matcher(regex);
        return matcher.matches();
    }
    static boolean checkID(String id){
        StudentManagement studentManagement = new StudentManagement();
        for (int i = 0; i <studentManagement.list.size() ; i++) {
            if (id.equals(studentManagement.list.get(i).getId())){
                return false;
            }
        }
        return true;
    }
}
