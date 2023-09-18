 
    import java.util.Scanner;
public class Lingkaran {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r;
        double phi, luas, keliling;
        System.out.println("Masukan r: ");
        r = sc.nextInt();
        System.out.println("Masukan phi: ");
        phi = sc.nextDouble();
        luas = phi * r * r;
        keliling = phi * (r + r);
        System.out.println("luas Lingkaran adalah: " + luas);
        System.out.println("keliling Lingkaran adalah: " + keliling);

        
    }
}
