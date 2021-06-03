public class Admissions {
   private Student [] listStudent ;
   int size = 0;
   public Admissions(){
      this.listStudent=new Student[20];
      this.size=0;
   }
   public void themMoi(Student student){
      listStudent[size]=student;
      size++;
   }
}


