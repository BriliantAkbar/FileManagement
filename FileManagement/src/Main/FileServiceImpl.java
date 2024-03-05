package Main;

class FileServiceImpl implements FileOperation {
    @Override
    public void create(String fileName) {
        System.out.println("File " + fileName + " telah dibuat");
    }

    @Override
    public String read(String fileName) {
        System.out.println("Membaca file " + fileName);
        return "Isi file " + fileName;
    }

    @Override
    public void update(String fileName, String content) {
        System.out.println("Mengupdate file " + fileName + " dengan konten: " + content);
    }

    @Override
    public void delete(String fileName) {
        System.out.println("File " + fileName + " telah dihapus");
    }
}