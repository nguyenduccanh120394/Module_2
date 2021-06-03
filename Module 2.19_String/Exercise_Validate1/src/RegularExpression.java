import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static final String CLASSNAME_REGEX= "^[CAP]{1,}[0-9]{4}[GHIKLM]{1,}$";
    public RegularExpression(){}
    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(CLASSNAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
