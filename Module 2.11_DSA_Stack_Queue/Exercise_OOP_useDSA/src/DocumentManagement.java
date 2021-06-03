import java.util.*;

public class DocumentManagement {
    private List<Document> documents;

    public DocumentManagement() {
        documents = new ArrayList<>();
    }

    public void add(Document document) {
        documents.add(document);
    }

    public void disPlay() {
        for (Document item : documents) {
            System.out.println(item);
        }
        System.out.println("===============");
    }

    public void disPlay(int number) {
        for (int i = 0; i < documents.size(); i++) {
            System.out.println(documents.get(number));
            break;
        }
    }

    public int find(int id) {
        for (int i = 0; i < documents.size(); i++) {
            if (documents.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public void edit(int id, Document document) {
        id = find(id);
        if (id == -1) {
            System.out.println("Not Found");
        } else {
            documents.set(id, document);
        }
    }

    public void delete(int id) {
        id = find(id);
        if (id == -1) {
            System.out.println("Not Found");
        } else {
            documents.remove(id);
        }
    }
    public void sort(){
        Collections.sort(documents);
    }
}
