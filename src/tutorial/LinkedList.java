package tutorial;

import java.util.*;

public class LinkedList {
    Node head;

    static class Node {
        String Nama, NIM;
        int UKT, Nominal;
        Node next;

        Node(String nama, String nim, int ukt, int nominal) {
            Nama = nama;
            NIM = nim;
            UKT = ukt;
            Nominal = nominal;
            next = null;
        }
    }

    public static LinkedList insert(LinkedList list, String nama, String nim, int ukt, int nominal) {
        Node newNode = new Node(nama, nim, ukt, nominal);
        if (list.head == null) {
            list.head = newNode;
        } else {
            Node tail = list.head;
            while (tail.next != null)
                tail = tail.next;
            tail.next = newNode;
        }
        return list;
    }

    public static LinkedList pay(LinkedList list, int nominal, int bayar) {
        if (bayar < nominal) {
            int kurang = nominal - bayar;
            System.out.println("\nJumlah uang anda tidak cukup untuk melunasi UKT.");
            System.out.println("Anda memerlukan Rp." + kurang + " untuk dapat melunasi UKT.\n");
        } else {
            int kembalian = bayar - nominal;
            System.out.println("Kembalian : " + kembalian + "\n");
            System.out.println("Pembayaran sukses.\n");
            list.head = list.head.next;
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList mhs = new LinkedList();
        System.out.print("\033[H\033[2J");
        System.out.println("Program Antrian Pembayaran UKT");
        char stop = 'T';
        while (stop != 'Y') {
            System.out.println("\nMenu : ");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Proses Pembayaran");
            System.out.println("3. Lihat Antrian");
            System.out.println("4. Keluar");
            System.out.print("Pilihan : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\nInput Data Mahasiswa");
                    System.out.print("Nama    : ");
                    sc.nextLine();
                    String Nama = sc.nextLine().trim();
                    System.out.print("NIM     : ");
                    String NIM = sc.nextLine().trim();
                    System.out.print("UKT     : ");
                    int UKT = sc.nextInt();
                    System.out.print("Nominal : ");
                    int Nominal = sc.nextInt();
                    mhs = insert(mhs, Nama, NIM, UKT, Nominal);
                    System.out.println("\nData berhasil ditambahkan.\n");
                    break;
                case 2:
                    if(mhs.head == null) {
                        System.out.println("\nAntrian kosong.\n");
                        break;
                    } else {
                        System.out.println("\nData Mahasiswa");
                        System.out.println("Nama    : " + mhs.head.Nama);
                        System.out.println("NIM     : " + mhs.head.NIM);
                        System.out.println("UKT     : " + mhs.head.UKT);
                        System.out.println("Nominal : " + mhs.head.Nominal);
                        System.out.print("Bayar   : ");
                        int bayar = sc.nextInt();
                        mhs = pay(mhs, mhs.head.Nominal, bayar);
                        break;
                    }
                case 3:
                    Node temp = mhs.head;
                    System.out.println("\n-----------------------------------------------------------------------------------");
                    System.out.println("| %-40s | %-11s | %-3s | %-16s |".formatted("Nama", "NIM", "UKT", "Nominal"));
                    System.out.println("-----------------------------------------------------------------------------------");
                    while (temp != null) {
                        System.out.println("| %-40s | %-11s | %-3d | Rp.%-13d |".formatted(temp.Nama, temp.NIM, temp.UKT, temp.Nominal));
                        temp = temp.next;
                    }
                    System.out.println("-----------------------------------------------------------------------------------\n");
                    break;
                case 4:
                    System.out.print("\nApakah anda yakin akan keluar (Y/T) : ");
                    stop = sc.next().charAt(0);
                    if (stop == 'Y') System.out.println("Terimakasih.");
                    break;
                default:
                    System.out.println("\nPilihan belum tersedia.\n");
                    continue;
            }
        }
        sc.close();
    }
}