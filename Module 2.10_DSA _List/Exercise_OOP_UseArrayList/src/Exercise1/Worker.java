package Exercise1;

public class Worker extends Officer{
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
        return "Worker{ name : " + getName() + ", age: " + getAge() + ", gender: "
                + getGender() +", address: " + getAddress() + ", rank: " + rank + '}';
    }
}
