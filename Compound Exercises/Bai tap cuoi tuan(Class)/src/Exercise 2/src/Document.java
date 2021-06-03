import java.util.Scanner;

public class Document {
    private int id;
    private String imprint;
    private int releases;

    public Document() {
    }

    public Document(int id, String imprint, int releases) {
        this.id = id;
        this.imprint = imprint;
        this.releases = releases;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImprint() {
        return imprint;
    }

    public void setImprint(String imprint) {
        this.imprint = imprint;
    }

    public int getReleases() {
        return releases;
    }

    public void setReleases(int releases) {
        this.releases = releases;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", imprint='" + imprint + '\'' +
                ", releases=" + releases +
                '}';
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã tài liệu:");
        int id = scanner.nextInt();
        System.out.println("Nhập tên nhà xuất bản:");
        String imprint= scanner.nextLine();
        scanner.nextLine();
        System.out.println("Nhập số bản phát hành:");
        int releases = scanner.nextInt();
    }
}



