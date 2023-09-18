import java.util.Scanner;
public class SegitigaSamaSisi {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alas, tinggi, miring;
        float luas, keliling;
        System.out.println("Masukan tinggi: ");
        tinggi = sc.nextInt();
        System.out.println("Masukan alas: ");
        alas = sc.nextInt();
        System.out.println("Masukan miring: ");
        miring = sc.nextInt();
        luas = (tinggi * alas) / 2;
        keliling = tinggi + alas + miring;
        System.out.println("luas Segitiga adalah: " + luas);
        System.out.println("keliling Segitiga adalah: " + keliling);

        
    }
}
