public class Journal extends Document{
    private int numberRelease;
    private int monthRelease;

    public Journal() {
    }
    public Journal(int numberRelease, int monthRelease) {
        this.numberRelease = numberRelease;
        this.monthRelease = monthRelease;
    }
    public Journal(int id, String imprint, int releases, int numberRelease, int monthRelease) {
        super(id, imprint, releases);
        this.numberRelease = numberRelease;
        this.monthRelease = monthRelease;
    }

    public int getNumberRelease() {
        return numberRelease;
    }

    public void setNumberRelease(int numberRelease) {
        this.numberRelease = numberRelease;
    }

    public int getMonthRelease() {
        return monthRelease;
    }

    public void setMonthRelease(int monthRelease) {
        this.monthRelease = monthRelease;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "numberRelease=" + numberRelease +
                ", monthRelease=" + monthRelease +
                '}';
    }
}
