import java.util.Comparator;

public class Document implements Comparable<Document> {
    private int id ;
    private String tenSach;
    private int soBanPhatHanh;

    public Document() {
    }

    public Document(int id, String tenNXB, int soBanPhatHanh) {
        this.id = id;
        this.tenSach = tenNXB;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", tenNXB='" + tenSach + '\'' +
                ", soBanPhatHanh=" + soBanPhatHanh +
                '}';
    }

    @Override
    public int compareTo(Document o) {
       return this.getSoBanPhatHanh()-o.getSoBanPhatHanh();
    }
}
