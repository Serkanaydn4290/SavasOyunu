import java.util.Random;
import java.util.Scanner;

public class MainSavasOyunu {
	
	
	private static Scanner scn = new Scanner(System.in);
	private static Random rnd = new Random();
	public static void main(String[] args) {
		
	
		System.out.println("===== EPIC BATTLE GAME =====");
        System.out.print("Oyuncu 1, lütfen isminizi girin: ");
        String isim1 = scn.nextLine();
        System.out.print("Oyuncu 2, lütfen isminizi girin: ");
        String isim2 = scn.nextLine();

        Karakter oyuncu1 = karakterSec(isim1);
        Karakter oyuncu2 = karakterSec(isim2);

        System.out.println("===== OYUN BAŞLIYOR =====");
        System.out.println("Oyuncu 1: " + oyuncu1);
        System.out.println("Oyuncu 2: " + oyuncu2);
        System.out.println("===== OYUN BAŞLADI =====\n");

        while (oyuncu1.getCanPuan() > 0 && oyuncu2.getCanPuan() > 0) {
            savas(oyuncu1, oyuncu2);
            if (oyuncu2.getCanPuan() <= 0) {
                System.out.println(oyuncu1.getIsim() + " kazandı! Tebrikler!");
                break;
            }
            savas(oyuncu2, oyuncu1);
            if (oyuncu1.getCanPuan() <= 0) {
                System.out.println(oyuncu2.getIsim() + " kazandı! Tebrikler!");
                break;
            }
        }

        System.out.println("\n===== OYUN BİTTİ =====");
    }

    private static Karakter karakterSec(String isim) {
        System.out.println("\n" + isim + ", lütfen karakter seçiniz:");
        System.out.println("1. Savaşçı");
        System.out.println("2. Büyücü");
        System.out.println("3. Okçu");
        System.out.print("Seçiminiz: ");

        int secim = scn.nextInt();
        scn.nextLine();

        switch (secim) {
            case 1:
                return new Savasci(isim);
            case 2:
                return new Buyucu(isim);
            case 3:
                return new Okcu(isim);
            default:
                System.out.println("Geçersiz seçim, varsayılan olarak Savaşçı seçildi.");
                return new Savasci(isim);
        }
    }

    private static void savas(Karakter saldiran, Karakter savunan) {
        System.out.println("\n" + saldiran.getIsim() + " saldırıyor!");
        int saldiriGucu = saldiran.getSaldiriGucu();
        if (saldiran.esyaIndeks > 0) {
            System.out.println(saldiran.getIsim() + "'in eşyaları:");
            saldiran.listItems();
            System.out.print(saldiran.getIsim() + ", saldırı gücünü artırmak için bir eşya seçin (1-" + saldiran.esyaIndeks + "). Seçiminiz: ");
            Random scn = null;
			int secim = scn.nextInt();
            scn.nextDouble();  
            if (secim >= 1 && secim <= saldiran.esyaIndeks) {
                Esya secilenEsya = saldiran.esyalar[secim - 1];
                saldiriGucu += secilenEsya.getIyilestirmeMiktari();
                System.out.println("Saldırı gücünüz " + secilenEsya.getAd() + " ile arttırıldı!");
            } else {
                System.out.println("Geçersiz seçim, eşya kullanılmadan saldırılıyor.");
            }
        }

        int savunma = savunan.getSavunma();
        int hasar = Math.max(0, saldiriGucu - savunma);
        savunan.setCanPuan(savunan.getCanPuan() - hasar);

        System.out.println(saldiran.getIsim() + " " + savunan.getIsim() + "'e " + hasar + " hasar verdi.");

        System.out.println(savunan.getIsim() + "'in kalan can puanı: " + savunan.getCanPuan());
    }
}






	
		
		
