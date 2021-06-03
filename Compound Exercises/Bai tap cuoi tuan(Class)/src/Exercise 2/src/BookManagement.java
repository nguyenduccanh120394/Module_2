public class BookManagement {
   private Document[] danhsach;
   private int size;
    public BookManagement() {
      danhsach= new Document[5];
      this.size =0;
    }
    public void add(Document element){
        danhsach[size]=element;
        size++;
    }
    public void display(){
        for (int i = 0; i < size; i++) {
            System.out.println(danhsach[i].toString());
        }
    }
    public void delete(int id){
        for (int i = 0; i < size; i++) {
            if ((this.danhsach[i].getId()==id))
            {
                this.danhsach[i]=null;
            }
        }
    }
    public int find(String name){
      return -1;
    }


}
