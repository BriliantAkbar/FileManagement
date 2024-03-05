package Main;

class FileManager {
    private final FileOperation fileOperation;
    private final FolderOperation folderOperation;

    public FileManager(FileOperation fileOperation, FolderOperation folderOperation) {
        this.fileOperation = fileOperation;
        this.folderOperation = folderOperation;
    }

    // Metode untuk membuat file
    public void createFile(String fileName) {
        fileOperation.create(fileName);
    }

    // Metode untuk membaca file
    public String readFile(String fileName) {
        return fileOperation.read(fileName);
    }

    // Metode untuk mengupdate file
    public void updateFile(String fileName, String content) {
        fileOperation.update(fileName, content);
    }

    // Metode untuk menghapus file
    public void deleteFile(String fileName) {
        fileOperation.delete(fileName);
    }

    // Metode untuk membuat folder
    public void createFolder(String folderName) {
        folderOperation.createFolder(folderName);
    }

    // Metode untuk menghapus folder
    public void deleteFolder(String folderName) {
        folderOperation.deleteFolder(folderName);
    }
}
