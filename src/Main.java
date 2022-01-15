import java.util.Scanner;
public class Main
{
    static void asalSayi(int sayi){
        int sayac=0;

        for (int i=2; i<sayi; i++){
            if (sayi%i==0){
                sayac ++;
            }
        }
        if (sayac == 0)
        {
            System.out.print(sayi+ " bir asal sayıdır.");
        }
        else{
            System.out.print(sayi+ " bir asal değildir.");
        }
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Lütfen sayı giriniz: ");
        int sayi= input.nextInt();

        asalSayi(sayi);
    }
}
