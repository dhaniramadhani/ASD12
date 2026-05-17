import java.util.Scanner;
public class DoubleLinkedListMain24 {
    static Scanner sc = new Scanner(System.in);

    static Mahasiswa24 inputMahasiswa() {
        System.out.print("NIM   : ");
        String nim = sc.nextLine();

        System.out.print("Nama  : ");
        String nama = sc.nextLine();

        System.out.print("Kelas : ");
        String kelas = sc.nextLine();

        System.out.print("IPK   : ");
        double ipk = sc.nextDouble();
        sc.nextLine();

        return new Mahasiswa24(nim, nama, kelas, ipk);
    }
    public static void main(String[] args) {

        DoubleLinkedList24 dll = new DoubleLinkedList24();

        int pilih;

        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Add First");
            System.out.println("2. Add Last");
            System.out.println("3. Insert After");
            System.out.println("4. Print");
            System.out.println("5. Print Reverse");
            System.out.println("0. Keluar");

            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    dll.addFirst(inputMahasiswa());
                    break;

                case 2:
                    dll.addLast(inputMahasiswa());
                    break;

                case 3:
                    System.out.print("Masukkan NIM setelah data: ");
                    String key = sc.nextLine();

                    Mahasiswa24 mhs = inputMahasiswa();
                    dll.insertAfter(key, mhs);
                    break;

                case 4:
                    dll.print();
                    break;

                case 5:
                    dll.printReverse();
                    break;

                case 0:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Menu tidak valid");
            }

        } while (pilih != 0);
    }
}