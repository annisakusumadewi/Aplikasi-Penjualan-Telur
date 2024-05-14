/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplikasipenjualantelur;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class AplikasiPenjualanTelur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Egg Order App!");

        System.out.print("Nama: ");
        String name = scanner.nextLine();

        System.out.print("Pesan Berapa Kilogram: ");
        int eggQuantity = scanner.nextInt();

        System.out.print("Kontak Whatsapp: ");
        String whatsappContact = scanner.next();

        System.out.print("Alamat: ");
        scanner.nextLine(); // consume newline character
        String address = scanner.nextLine();

        System.out.print("Total Pembayaran (Cash/ Transfer Bank): ");
        String paymentMethod = scanner.next();

        int totalPayment = calculateTotalPayment(eggQuantity);

        System.out.println("\n--- Order Summary ---");
        System.out.println("Nama: " + name);
        System.out.println("Pesan Berapa Kilogram: " + eggQuantity);
        System.out.println("Kontak Whatsapp: " + whatsappContact);
        System.out.println("Alamat: " + address);
        System.out.println("Metode Pembayaran: " + paymentMethod);
        System.out.println("Total Pembayaran: Rp " + totalPayment);
    }

    private static int calculateTotalPayment(int eggQuantity) {
        // Assume each egg costs Rp 25000
        return eggQuantity * 25000;
    }
}
    

