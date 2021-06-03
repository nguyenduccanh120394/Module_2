public class InterestBank {
    public static void main(String[] args) {
        double money =1.0;
        int month = 1;
        double profit = 1.0;

        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Money :");
        money = input.nextDouble();
        System.out.println("Time (month) ");
        month = input.nextInt();
        System.out.println("Profit : ");
        profit = input.nextDouble();
        System.out.println("totalProfit :");

        double totalProfit = 0;
        for (int i = 0; i < month; i++) {
            totalProfit = money *( profit/100)/12 * month;
        }
        System.out.println(+totalProfit);
    }
}
