package Main;

class FolderServiceImpl implements FolderOperation {
    @Override
    public void createFolder(String folderName) {
        System.out.println("Folder " + folderName + " telah dibuat");
    }

    @Override
    public void deleteFolder(String folderName) {
        System.out.println("Folder " + folderName + " telah dihapus");
    }
}

