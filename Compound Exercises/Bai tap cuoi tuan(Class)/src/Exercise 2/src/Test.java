import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        BookManagement bookManagement = new BookManagement();
        int choice;
        do {
            functions();
            choice = scanner.nextInt();
            if (choice<=0){
                System.out.println("Enter your choise (0<choice<6)");
            }else {
                switch (choice){

                    case 1:
                        System.out.println("Thêm mới tài liệu: ");
                        System.out.println("a.Thêm mới Sách");
                        System.out.println("b.Thêm mới Tạp Chi");
                        System.out.println("c.Thêm mới Báo");
                        String type =scanner.next();
                        switch (type){
                            case "a":
                                System.out.println("Thêm mới Sách");
                                System.out.println("Nhập mã tài liệu:");
                                int id = scanner.nextInt();
                                System.out.println("Nhập tên nhà xuất bản:");
                                scanner.nextLine();
                                String imprint= scanner.nextLine();
                                System.out.println("Nhập số bản phát hành:");
                                int releases = scanner.nextInt();
                                System.out.println("Nhập Tên tác giả: ");
                                scanner.nextLine();
                                String writerName = scanner.nextLine();
                                System.out.println("Nhập Số Trang: ");
                                int numberPage = scanner.nextInt();
                                Book book = new Book(id,imprint,releases,writerName,numberPage);
                                bookManagement.add(book);
                                System.out.println(book);
                                break;
                            case "b":
                                System.out.println("Thêm mới Tạp Chi");
                                Journal journal = new Journal();
                                journal.input();
                                bookManagement.add(journal);
                                bookManagement.display();
                                break;
                            case "c":
                                System.out.println("Thêm mới Báo");
                                Newspaper newspaper = new Newspaper();
                                newspaper.input();
                                bookManagement.add(newspaper);
                                bookManagement.display();
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("Xóa tài liệu theo mã tài liệu");
                        System.out.println("Nhập id tài liệu muốn xóa");
                        int id = scanner.nextInt();
                        bookManagement.delete(id);
                        bookManagement.display();
                        break;
                    case 3:
                        System.out.println("Hiển thị thông tin tài liệu");
                        bookManagement.display();
                        break;
                    case 4:
                        System.out.println("Tìm kiếm tài liệu theo loại: Sach , báo, tạp chí");
                        break;
                    case 5:
                        System.out.println("Exit");
                        System.exit(0);
                        break;
                }
            }
        }while (0<=choice && choice<6);
        }
    static void functions(){
        System.out.println("=====MENU=====");
        System.out.println("1.Thêm mới tài liệu");
        System.out.println("2.Xóa tài liệu theo mã tài liệu");
        System.out.println("3.Hiển thị thông tin tài liệu");
        System.out.println("4.Tìm kiếm tài liệu theo loại: Sach , báo, tạp chí");
        System.out.println("5.Exit");
    }

}

