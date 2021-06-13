package service;

import model.Film;

import java.util.List;
import java.util.Random;

public class RandomID {
    private static final String CHAR_LIST = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    private static final int RANDOM_STRING_SIZE = 6;
    public static String generateRandomString()
    {
        StringBuffer randStr = new StringBuffer();
        for(int i=0; i<RANDOM_STRING_SIZE; i++)
        {
            int number = getRandomNumber();
            char ch = CHAR_LIST.charAt(number);
            randStr.append(ch);
        }
        return randStr.toString();
    }
    private static int getRandomNumber()
    {
        int randomInt = 0;
        Random randomGenerator = new Random();
        randomInt = randomGenerator.nextInt(CHAR_LIST.length());
        if (randomInt - 1 == -1)
        {
            return randomInt;
        }
        else
        {
            return randomInt - 1;
        }
    }


}
