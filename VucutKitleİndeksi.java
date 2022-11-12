import java.util.Scanner ;
public class VucutKitleİndeksi {
public static void main(String[] args) {
    double boy, vki;
    int kilo ;
    Scanner scan = new Scanner(System.in);

    System.out.print("Boyunuzu metre cinsinden giriniz: ");
    boy= scan.nextDouble();
    System.out.print("Kilonuzu Giriniz: ");
    kilo= scan.nextInt();
    vki = kilo / (boy*boy);

    System.out.println("Vücut Kitle İndeksiniz= "+vki);


}

}
