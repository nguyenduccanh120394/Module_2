import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ManagementPerson {
    private List<Person> personList;

    public ManagementPerson() throws IOException, ClassNotFoundException {
            this.personList = new ArrayList<>();
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public String display() {
        String str = "";
        for (Person p : this.personList) {
            str += p.toString() + "\n";
        }
        return str;
    }

    public void add(Person person) throws IOException {
        this.personList.add(person);
        ManagementFile.writeToFile(this.personList, ManagementFile.sourceFile);
        System.out.println("Thêm thành công!");
    }

    public int findById(int id) {
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public void edit(int id, Person person) throws IOException {
        if (findById(id) == -1) {
            System.out.println("Id không tồn tại!");
        } else {
            personList.set(findById(id), person);
            ManagementFile.writeToFile(this.personList, ManagementFile.sourceFile);
            System.out.println("Sửa thành công!");
        }
    }

    public void remove(int id) throws IOException {
        if (findById(id) == -1) {
            System.out.println("Id không tồn tại!");
        } else {
            personList.remove(findById(id));
            ManagementFile.writeToFile(this.personList, ManagementFile.sourceFile);
            System.out.println("Xoá thành công!");
        }
    }
}
