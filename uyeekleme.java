// Butona tıklandığında çalışacak olan standart ActionEvent metodu
private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    
    // 1. ADIM: VERİLERİ AL, BÜYÜT VE LİSTEYE EKLE
    // jtaMemberList: Büyük liste alanı. 
    // append: Var olan yazıyı silmeden sonuna yeni metin ekler.
    // getText(): İlgili metin kutusunun içindeki değeri alır.
    // toUpperCase(): Ad ve Soyad kutularından alınan yazıyı BÜYÜK HARFE çevirir.
    // + (Artı): Sabit metinler (" Adı: " gibi) ile değişkenleri birbirine bağlar.
    // \n (Ters Slash N): İşlem bitince imleci bir alt satıra atar (Enter tuşu görevi).
    jtaMemberList.append(" Adı: " + jtfAdi.getText().toUpperCase() + 
                         " Soyadı: " + jtfSoyadi.getText().toUpperCase() +
                         " Yaş: " + jtfYasi.getText() + 
                         " Boy: " + jtfBoyu.getText() + 
                         " Adres: " + jtfAdres.getText() + "\n" );

    // 2. ADIM: ARAYA AYIRICI ÇİZGİ ÇEK
    // Her üye kaydından sonra karışıklığı önlemek için alt satıra bir çizgi ekler.
    // Sondaki \n sayesinde çizgi çekildikten sonra da bir alt satıra inilir.
    jtaMemberList.append("------------------------------------------\n");

    // 3. ADIM: DURUM ÇUBUĞUNU (LABEL) GÜNCELLE
    // jlDurum: Formun altındaki bilgi etiketi.
    // setText: Etiketin üzerindeki yazıyı silip yerine tamamen yeni yazıyı yazar.
    // getLineCount(): jtaMemberList içindeki toplam fiziksel satır sayısını sayar.
    jlDurum.setText("Durum: Toplam " + jtaMemberList.getLineCount() + " satır bulunmaktadır ! ");

}
//KASA SORUSU
private void btnHesaplaActionPerformed(java.awt.event.ActionEvent evt) {
    
    // 1. Kutulardaki yazıları alıp küsuratlı sayıya (Double) çeviriyoruz
    double toplam = Double.parseDouble(txtToplam.getText());
    double odenen = Double.parseDouble(txtOdenen.getText());
    
    // 2. Kalan miktarı hesaplıyoruz
    double kalan = toplam - odenen;
    
    // 3. Bulduğumuz sayıyı tekrar metne çevirip Kalan kutusuna (jTextField1) yazdırıyoruz
    jTextField1.setText(String.valueOf(kalan));

}

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    /*
    Doviz kuru double bir sayı olmalıdır.Doviz kuru ve doviz miktarı
    double bir sayı olarak parse edilir ve dönüştürülen değer geçici
    bir değişkene aktarılır.
    */
    double sonuc= Double.parseDouble(jTextField1.getText())*Double.parseDouble(jTextField2.getText());
    jLabel1.setText("Doviziniz " + sonuc+ "TL'dir. " );
}

//1. Olay Tabanlı Programlama (Event-Driven Programming) Nedir?
/*Geleneksel programlar yukarıdan aşağı çalışıp biter. Olay tabanlı
programlar ise açılır ve kullanıcının bir eylem yapmasını (örneğin butona tıklamasını) bekler.
Tıklama "olayı" gerçekleşince sadece o butona ait kod bloğu çalışır.*//

//2. NetBeans ile Eclipse Arasındaki Farklar Nelerdir?
/*NetBeans: Özellikle görsel arayüz (GUI) tasarımı yapmak için harikadır. 
İçinde varsayılan olarak gelen "Matisse" aracı sayesinde
butonları, kutuları sürükle-bırak yöntemiyle çok kolay yerleştirirsiniz.
Yeni başlayanlar ve hızlı arayüz tasarlamak isteyenler için idealdir.

Eclipse: Daha çok kurumsal projelerde tercih edilen, devasa bir eklenti (plugin) havuzuna
sahip olan bir ortamdır. Ancak varsayılan halinde sürükle-bırak arayüz tasarımı yoktur;
görsel tasarım yapabilmek için sonradan eklenti (örneğin WindowBuilder) kurmak gerekir.*/

//AWT ve Swing Kütüphaneleri Arasındaki Fark Nedir?
/*AWT (Abstract Window Toolkit): Eski nesildir. İşletim sisteminin 
kendi grafik araçlarını kullanır (Ağır bileşenler). Bu yüzden yazdığınız
program Windows'ta farklı, Mac'te farklı görünür.

Swing: AWT'nin üzerine geliştirilmiş, tamamen Java ile yazılmış modern
kütüphanedir (Hafif bileşenler). İşletim sisteminden bağımsızdır,
program her bilgisayarda aynı görünür. Sınavda kullandığınız JButton, JTextField 
gibi başında "J" olan nesneler Swing nesneleridir.*/

//Component (Bileşen) ve Container (Kapsayıcı) Farkı Nedir?
/*Component (Bileşen): Ekranda gördüğümüz, tek başına bir işlevi olan bağımsız nesnelerdir.
(Örnek: Buton, metin kutusu, etiket).

Container (Kapsayıcı): Bu bileşenleri içine koyduğumuz, onları bir arada tutup düzenleyen
taşıyıcı kutulardır. (Örnek: Arka plan paneli olan JPanel veya pencerenin kendisi olan JFrame).*/
