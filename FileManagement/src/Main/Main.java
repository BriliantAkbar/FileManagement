package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Membuat sebuah instance dari SoftwareCompanyFileManager untuk mengelola file
        FileManager fileManager = new FileManager(new FileServiceImpl(), new FolderServiceImpl());

        // Membuat objek Scanner untuk membaca input pengguna dari konsol
        Scanner scanner = new Scanner(System.in);

        // Terus menerus meminta pengguna untuk operasi sampai mereka memilih untuk keluar
        while (true) {

            // Menampilkan pilihan menu
            System.out.println("Pilih operasi yang ingin Anda lakukan:");
            System.out.println("1. Buat file");
            System.out.println("2. Baca file");
            System.out.println("3. Perbarui file");
            System.out.println("4. Hapus file");
            System.out.println("5. Buat folder");
            System.out.println("6. Keluar");
            System.out.print("Masukkan pilihan Anda: ");

            // Membaca pilihan pengguna
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            // Melakukan tindakan berdasarkan pilihan pengguna
            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama file yang ingin dibuat: ");
                    String createFileName = scanner.nextLine();
                    fileManager.createFile(createFileName);
                    break;
                case 2:
                    System.out.print("Masukkan nama file yang ingin dibaca: ");
                    String readFileName = scanner.nextLine();
                    String content = fileManager.readFile(readFileName);
                    System.out.println("Isi file " + readFileName + ": " + content);
                    break;
                case 3:
                    System.out.print("Masukkan nama file yang ingin diupdate: ");
                    String updateFileName = scanner.nextLine();
                    System.out.print("Masukkan konten baru: ");
                    String updateContent = scanner.nextLine();
                    fileManager.updateFile(updateFileName, updateContent);
                    break;
                case 4:
                    System.out.print("Masukkan nama file yang ingin dihapus: ");
                    String deleteFileName = scanner.nextLine();
                    fileManager.deleteFile(deleteFileName);
                    break;
                case 5:
                    System.out.print("Masukkan nama folder yang ingin dibuat: ");
                    String createFolderName = scanner.nextLine();
                    fileManager.createFolder(createFolderName);
                    break;
                case 6:
                    // Keluar dari program
                    System.out.println("Terima kasih!");
                    System.exit(0);
                default:
                    // Memberi tahu pengguna tentang pilihan yang tidak valid
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }
}
