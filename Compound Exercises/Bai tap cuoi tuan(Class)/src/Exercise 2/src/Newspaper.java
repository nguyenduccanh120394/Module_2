public class Newspaper extends Document {
    private int releaseDate;
    public Newspaper(){};

    public Newspaper(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Newspaper(int id, String imprint, int releases, int releaseDate) {
        super(id, imprint, releases);
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "releaseDate=" + releaseDate +
                '}';
    }
}
