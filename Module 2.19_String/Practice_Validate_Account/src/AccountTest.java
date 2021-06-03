public class AccountTest {
    public static final String[] account = new String[]{"123abc_", "_abc123", "______", "123456","abcdefgh" };
    public static final String[] account2 = new String[]{".@", "12345", "1234_", "abcde" };

    public static void main(String[] args) {
        AccountExample accountExample = new AccountExample();
        for (String item:account){
            boolean result = accountExample.validate(item);
            System.out.println("Account "+item+" is "+result);
        }
        for (String item:account2){
            boolean result = accountExample.validate(item);
            System.out.println("Account "+item+" is "+result);
        }
    }
}
