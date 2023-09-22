
//    1)Karakter Sınıfı:
//    Karakter sınıfı, oyunun karakterlerini temsil eder. Bu sınıfta karakterin ismi, can puanı, saldırı gücü, savunma ve eşyaları gibi özellikler bulunur.
//    Bu sınıfın alt sınıfları olan Savasci, Buyucu ve Okcu bu özellikleri kullanarak kendilerine özgü karakterler oluşturur.

//    2)Savasci, Buyucu ve Okcu Sınıfları:
//    Bu sınıflar, Karakter sınıfından türetilmiş sınıflardır. Her biri farklı türde bir karakteri temsil eder (savaşçı, büyücü, okçu). Bu sınıflar
//    üst sınıf olan Karakter sınıfından gelen özellikleri kullanarak kendi özelliklerini belirler. burada nesne yönelimli programının "kalıtım" 
//    ilişkisiini kullanıyoruz extends ediyoruz.

//    3)Esya Sınıfı:
//    Esya sınıfı, oyun içinde kullanılacak eşyaları temsil eder. Her eşyanın adı ve iyileştirme miktarı vardır.



//    4)Main sınıfı
//    karakterSec metodu, oyuncuların karakter seçmesini sağlar ve seçilen karakteri oluşturur.
//    savas metodu, iki karakter arasında bir savaşı simüle eder.