import java.util.Scanner;

public class Book extends Document {
    private String writerName;
    private int numberPage;
    public Book(){}

    public Book(String writerName, int numberPage) {
        this.writerName = writerName;
        this.numberPage = numberPage;
    }

    public Book(int id, String imprint, int releases, String writerName, int numberPage) {
        super(id, imprint, releases);
        this.writerName = writerName;
        this.numberPage = numberPage;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public int getNumberPage() {
        return numberPage;
    }

    public void setNumberPage(int numberPage) {
        this.numberPage = numberPage;
    }

    @Override
    public String toString() {
        return "Book { id : "+getId()+", imprint: "+getImprint()+", releases: "+getReleases()
                +", Write name: "+getWriterName()+", Number Page: "+getNumberPage()+"}";
    }

}
