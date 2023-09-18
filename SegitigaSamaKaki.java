import java.util.Scanner;
public class SegitigaSamaKaki {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tinggi, alas, miring;
        float luas, keliling;
        System.out.println("Masukan tinggi: ");
        tinggi = sc.nextInt();
        System.out.println("Masukan alas: ");
        alas = sc.nextInt();
        System.out.println("Masukan miring: ");
        miring = sc.nextInt();
        luas = (alas * tinggi) / 2;
        keliling = alas + (miring * 2);
        System.out.println("luas Segitiga adalah: " + luas);
        System.out.println("keliling Segitiga adalah: " + keliling);

        
    }
}