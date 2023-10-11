# MAYIN TARLASI

* Oyun Kuralları : <br>
* Oyun metin tabanlıdır.<br>
* Çift boyutlu diziler üzerinden oynanmalı ve MineSweeper sınıfı içerisinde tasarlanmalı.<br>
* Matris boyutunu yani satır ve sütun sayısını kullanıcı belirlemeli.<br>
* Diziye ait eleman sayısının çeyreği (elemanSayisi / 4) kadar rastgele mayın yerleştirilmeli. Örneğin dizi 4x3 boyutunda ise eleman sayısı (satırSayısı * sütunSayısı) formülü ile hesaplanmalı ve boyutu 12 olmalı. Bu durumda mayın sayısı 12 / 4 = 3 adet olmalıdır. (ipucu : bu mayınların konumlarını tutacak ikinci bir dizi oluşturabilirsiniz.)<br>
* Kullanıcı matris üzerinden bir nokta seçmeli. Nokta seçimi için satır ve sütun değerlerini girmeli.<br>
* Seçilen noktanın dizinin sınırları içerisinde olup olmadığını kontrol edilmeli ve koşul sağlanmazsa tekrar nokta istenmeli.<br>
* Kullanıcının girdiği noktada mayın var ise oyunu kaybetmeli.<br>
* Mayın yok ise, ilgili noktaya değen tüm konumlarına bakılmalı (sağı, solu, yukarısı, aşağısı, sol üst çapraz, sağ üst çapraz, sağ alt çapraz, sol alt çapraz) ve etrafındaki mayınların sayısının toplamı ilgili noktaya yazılmalı. Noktaya değen herhangi bir mayın yok ise "0" değeri atanmalı.<br>
* Kullanıcı hiç bir mayına basmadan tüm noktaları seçebilirse oyunu kazanmalı.<br>
<br>
<br>

*Kaybetme Senaryosu*<br>


<img width="387" alt="Ekran Resmi 2023-10-11 18 24 19" src="https://github.com/zzavlamaz/MayinTarlasi/assets/143629429/76a374ea-3de8-428e-880e-a3203748995f"><br>
<br>
<br>

*Kazanma Snaryosu*<br>

<img width="351" alt="Ekran Resmi 2023-10-11 18 26 03" src="https://github.com/zzavlamaz/MayinTarlasi/assets/143629429/fce7c302-3c48-49c4-a16c-218dccabff5c">
