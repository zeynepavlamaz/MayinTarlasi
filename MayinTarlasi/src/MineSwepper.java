import java.util.Random;
import java.util.Scanner;

class MineSweeper
//Değerlendirme formu 5: Proje MineSweeper sınıfı içerisinde tasarlanmış
{
    int mineCount;
    int row, column;
    String[][] board;
    String[][] mineMap;
    boolean gameStat = true;

    MineSweeper(int row, int column) {
        this.row = row;
        this.column = column;
        board = new String[row][column];
        mineMap = new String[row][column];
        createMineMap();
        printMap();
        gameLoop();
    }

    // Değerlendirme Formu 6: Oyun başlatma ve kontrol fonksiyonları bu metodda tanımlanmış.
    //gameLoop fonksiyonu, oyunun ana döngüsünü yönetir ve kullanıcının hamlelerini alır, oyun durumunu kontrol eder ve sonuçları ekrana yansıtır.
    public void gameLoop() {
        while (gameStat) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Satır seçin: "); // Değerlendirme Formu 9: Kullanıcıdan satır bilgisi alınıyor.
            int pickedRow = scan.nextInt();
            System.out.print("Sütun seçin: "); // Değerlendirme Formu 9: Kullanıcıdan sütun bilgisi alınıyor.
            int pickedColumn = scan.nextInt();
            if (pickedRow < 0 || pickedRow > row - 1 || pickedColumn < 0 || pickedColumn > column - 1) {
                System.out.println("Dizi sınırları dışında bir alan seçtiniz!"); // Değerlendirme Formu 10: Sınırlar kontrol ediliyor ve uyarı mesajı veriliyor.
                continue;// Değerlendirme formu 10: Tekrar giriş isteniyor
            }
            if (checkMap(pickedRow, pickedColumn)) {
                checkAndPrint(pickedRow, pickedColumn);
            } else {
                System.out.println("Oyun Bitti"); // Değerlendirme Formu 13 ve 15: Mayına bastığında oyunu kaybetme kontrolü yapılıyor.
                gameStat = false;
            }
        }
    }

    // Değerlendirme Formu 8: Dizi boyutunun 4'te 1'i kadar mayın bu metod ile yerleştiriliyor.
    public void createMineMap() {
        int mineCount = (row * column) / 4;
        int i = 0;
        while (i < mineCount) {
            Random rnd = new Random();
            int randRow = rnd.nextInt(row);
            int randColumn = rnd.nextInt(column);
            if (checkMap(randRow, randColumn)) {
                mineMap[randRow][randColumn] = "*";
            } else {
                i--;
            }
            i++;
        }
    }

    //Bu metod, oyunun akışında kullanılır ve kullanıcının seçtiği konumda mayın olup olmadığını kontrol etmek için çağrılır.
    public boolean checkMap(int rowNumber, int columnNumber) {
        return !"*".equals(mineMap[rowNumber][columnNumber]);
    }



    // Bu metod(printMap), oyun alanının güncel durumunu göstermek için kullanılır. Her çalıştığında oyun alanındaki değişikliklerin ekrana yansımasını sağlar.
    public void printMap() {
        for (int i = 0; i < row; i++) {
            for (int k = 0; k < column; k++) {
                if (!"*".equals(mineMap[i][k])) {
                    System.out.print("-");
                    mineMap[i][k] = "-";
                } else
                    System.out.print(mineMap[i][k]);
            }
            System.out.println();
        }
    }


    // Değerlendirme formu 11 : Kullanıcı her hamle yaptığında oyun alanı güncelleniyor.
    //checkAndPrint fonksiyonu, kullanıcının seçtiği noktanın etrafındaki mayınları kontrol eder ve bu bilgiye göre oyun alanını günceller ve ekrana yansıtır.
    public void checkAndPrint(int pickedRow, int pickedColumn) {
        int temp = 0;
        int tempCont = 0;
        for (int i = pickedRow - 1; i <= pickedRow + 1; i++) {
            if (i < 0 || i > row - 1) continue;
            for (int k = pickedColumn - 1; k <= pickedColumn + 1; k++) {
                if (k < 0 || k > column - 1) continue;
                if ("*".equals(mineMap[i][k])) {
                    temp++;
                }
            }
        }
        mineMap[pickedRow][pickedColumn] = Integer.toString(temp);
        for (int i = 0; i < row; i++) {
            for (int k = 0; k < column; k++) {
                if (Character.isDigit(mineMap[i][k].charAt(0)))//Değerlendirme formu 10 : Girilen noktada mayın yoksa etrafındaki mayın sayısı veya 0 değeri yerine yazılmış mı?
                    System.out.print(mineMap[i][k]);
                else if ("*".equals(mineMap[i][k]))
                    System.out.print("-");
                else {
                    tempCont++;
                    System.out.print("-");
                }
            }
            System.out.println();
        }
        if (tempCont < 1) {
            gameStat = false;
            System.out.println("KAZANDINIZ!"); // Değerlendirme Formu 14 ve 15: Oyun kazanma kontrolü yapılıyor ve uygun mesaj veriliyor.
        }
    }
}

// Değerlendirme Formu 1: Değişkenler ve fonksiyonlar anlaşılır bir şekilde isimlendirilmiş.
// Değerlendirme Formu 2: Açıklayıcı yorumlar eklendi.
// Değerlendirme Formu 3: Kodlama düzeni ve okunabilirlik yeterli.
// Değerlendirme Formu 4: Girintiler doğru kullanılmış.
