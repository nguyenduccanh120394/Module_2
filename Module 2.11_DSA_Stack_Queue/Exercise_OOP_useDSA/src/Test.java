import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DocumentManagement documentManagement = new DocumentManagement();
        Document document1 = new Document(1,"Doremon",1000);
        Document document2 = new Document(2,"Nobita",1000);
        Document document3= new Document(3,"Xuka",1000);
        Document document4 = new Document(4,"ChaiEn",1000);
        documentManagement.add(document1);
        documentManagement.add(document2);
        documentManagement.add(document3);
        documentManagement.add(document4);
        documentManagement.disPlay();
        System.out.println("Nhap vi tri tim");
        int indexS=scanner.nextInt();
        System.out.println(documentManagement.find(indexS));
        documentManagement.disPlay(indexS);
        System.out.println("Nhap vi tri can sua");
        int indexE=scanner.nextInt();
        documentManagement.edit(indexE,new Document(5,"Canh",1500));
        documentManagement.disPlay();
        documentManagement.delete(2);
        documentManagement.disPlay();
        documentManagement.sort();
        documentManagement.disPlay();
    }
}
