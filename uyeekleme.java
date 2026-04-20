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
