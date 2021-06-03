import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    public static final String PHONENUMBER_REGEX = "^[(]{1}[0-9]{2}[)][-]{1}[(]{1}[0]{1}[0-9]{9}[)]{1}$";
    public PhoneNumber(){}
    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(PHONENUMBER_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
