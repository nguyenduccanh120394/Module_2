public class Management {
   private Staff[] danhsach ;
   int size;
    public Management(){
        danhsach= new Staff[100];
        this.size=0;
    }

    public Staff[]getDanhsach() {
        return danhsach;
    }

    public void addS(Staff element) {
        danhsach[size]=element;
        size++;
    }
    public int find(String name){
        for (int i = 0; i < size; i++) {
            if (danhsach[i].getName().equals(name)){
               return i;
            }
        }return -1;
    }
    public void display(){
        for (int i = 0; i < size; i++) {
            System.out.println(danhsach[i].toString());
        }
    }
}