import java.util.*;


public class StudentManagement {
    Map<Integer, Student> studentMap = null;

    public StudentManagement() {
        studentMap = new HashMap<>();
    }

    public void addS(int id, Student student) {
        studentMap.put(id, student);
    }

    public void disPlay() {
        Set<Integer> keys = studentMap.keySet();
        for (Integer item : keys) {
            System.out.println(studentMap.get(item));
        }
        System.out.println("======================");
    }

    public Student find(int id) {
     if (!studentMap.containsKey(id)){
         System.out.println("Not Found");
        }
     return studentMap.get(id);
    }
    public void edit(int id , Student student){
        if (!studentMap.containsKey(id)){
            System.out.println("Not Found");
        }else {
            studentMap.replace(id,student);
        }
    }
    public void delete(int id){
        if (!studentMap.containsKey(id)){
            System.out.println("Not Found");
        }else {
            studentMap.remove(id);
        }
    }
    public void sort(){
        List<Map.Entry<Integer,Student>> list = new LinkedList<>(studentMap.entrySet());
        Object a = studentMap.entrySet();
        Collections.sort(list, new Comparator<Map.Entry<Integer, Student>>() {
            @Override
            public int compare(Map.Entry<Integer, Student> o1, Map.Entry<Integer, Student> o2) {
                return o1.getValue().getLevel()-o2.getValue().getLevel();
            }
        });
        Map<Integer,Student>studentMap= new LinkedHashMap<>();
        for (Map.Entry<Integer,Student>entry:list){
            studentMap.put(entry.getKey(),entry.getValue());
        }
        this.studentMap=studentMap;
    }
}
