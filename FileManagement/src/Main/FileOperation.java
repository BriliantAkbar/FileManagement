package Main;

public interface FileOperation {
    void create(String fileName);
    String read(String fileName);
    void update(String fileName, String content);
    void delete(String fileName);
}

