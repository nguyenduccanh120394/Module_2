package service;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    private static final String NUMBER_PHONE_REGEX = "^[0]{1}[0-9]{9,10}$";
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9]*@{1}[a-z]*[m][a][i][l][.][a-z]*$";
    private static final String DATE_REGEX = "^([0][1-9]{1}||[1][0-9]{1}||[2][0-9]{1}||[3][0-1]{1})*[/]([0][1-9]{1}||[1][1-2]{1})*[/][1-2]{1}[0-9]{3}$";
    private static final String TIME_REGEX = "^([0][0-9]*||[1][0-9]{1}||[2][0-3]{1})*[:][0-5]{1}[0-9]{1}$";
    private static final String ID_REGEX = "^[a-zA-Z0-9]{6,12}$";
    private static final String PASSWORD_REGEX = "^[a-zA-Z0-9!@#$%^&*()_+<>?:',]{8,12}$";
    private static final String STAFF_ID_REGEX = "^[S][0-9]{2}$";
    private static final String ROOM_ID_REGEX = "^[R][0-9]{2}$";
    private static final String FILM_ID_REGEX = "^[C][N][0-9]{2}$";

    private static Pattern pattern;
    private static Matcher matcher;

    public static boolean validate(String regex , String REGEX){
        pattern = Pattern.compile(REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static String getNumberPhoneRegex() {
        return NUMBER_PHONE_REGEX;
    }

    public static String getEmailRegex() {
        return EMAIL_REGEX;
    }

    public static String getDateRegex() {
        return DATE_REGEX;
    }

    public static String getTimeRegex() {
        return TIME_REGEX;
    }

    public static String getIdRegex() {
        return ID_REGEX;
    }

    public static String getPasswordRegex() {
        return PASSWORD_REGEX;
    }

    public static String getStaffIdRegex() {
        return STAFF_ID_REGEX;
    }

    public static String getRoomIdRegex() {
        return ROOM_ID_REGEX;
    }

    public static String getFilmIdRegex() {
        return FILM_ID_REGEX;
    }
}
