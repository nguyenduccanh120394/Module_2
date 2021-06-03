import java.util.Scanner;

public class Worker extends Staff{
    private int rank;

    public Worker() {
    }

    public Worker(int rank) {
        this.rank = rank;
    }

    public Worker(String name, int age, String gender, String address, int rank) {
        super(name, age, gender, address);
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "rank=" + rank +
                '}'+super.toString();
    }

//    @Override
//    public void add() {
//        Scanner scanner = new Scanner(System.in);
//        super.add();
//        String address = scanner.nextLine();
//        System.out.println("Enter rank of Worker: ");
//        int rank = scanner.nextInt();
//
//    }

}
