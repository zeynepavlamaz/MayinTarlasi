import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");
        //Değerlendirme formu 6: oyun başlatma metodu burda çağırılıyor

       // Değerlendirme formu 7: Dizi (matris) boyutu kullanıcı tarafından belirlenmiş mi?
        System.out.print("Satır sayısı giriniz :  ");
        int rows= scan.nextInt();

        System.out.print("Sütun sayısı giriniz: ");
        int columns= scan.nextInt();

        MineSweeper mineSweeper = new MineSweeper(rows,columns);

    }

}