import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManagement {
    private static final String COMMA_DELIMITER = ",";
    List<Product>list;
    public ProductManagement(){
        try {
            this.list = readFile("demo.csv");
        } catch (IOException e) {
            this.list=new ArrayList<>();
        }
    }
    public List<Product> getList(){
        return list;
    }
    public void add(Product product){
        try {
            list.add(product);
            writeFile("demo.csv",list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void writeFile(String path , List<Product> list)throws IOException {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(path);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < list.size(); i++) {
                bufferedWriter.write(list.get(i).getId()+","+list.get(i).getName()+","+list.get(i).getPrice()+","
                        +list.get(i).getDescription()+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            bufferedWriter.close();
            fileWriter.close();
        }
    }
    public List<Product> readFile(String path)throws FileNotFoundException,IOException{
        FileReader fileReader ;
        BufferedReader br = null;
        List<Product>list= new ArrayList<>();
        try {
            String line;
            fileReader = new FileReader(path);
            br= new BufferedReader(fileReader);
            while ((line=br.readLine())!=null){
               list.add(Product(parseCsvLine(line))) ;
            }
        }catch (IOException e){
            System.out.println("Not Found");
        }finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
        return list;
    }
    public List<String> parseCsvLine(String csvLine){
        List<String> result = new ArrayList<>();
        if (csvLine != null){
            String[] splitData = csvLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }
    private Product Product(List<String>pr){
        Product product = new Product(Integer.parseInt(pr.get(0)),pr.get(1),Integer.parseInt(pr.get(2)),pr.get(3));
    return product;
    }
    public int findById(int id){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId()==id){
                return i;
            }
        }
        return -1;
    }
    public static void menu(){
        System.out.println("+++++++++++++++Menu+++++++++++++++");
        System.out.println("1.Add       2.Edit       3.Delete");
        System.out.println("4.Search    5.DisPlay    6.Sort");
    }
    public Product inPut(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Information :");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        System.out.print("Name: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.print("Price: ");
        int price = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Description: ");
        String description = scanner.nextLine();
        return new Product(id,name,price,description);
    }
    public void disPlay(){
        for (Product item :list){
            System.out.println(item);
        }
        System.out.println();
    }
    public void deleteById(int id){
        int index = findById(id);
        if (index==-1){
            System.out.println("Not Found");
        }else {
            try {
                list.remove(index);
                writeFile("demo.csv",list);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
