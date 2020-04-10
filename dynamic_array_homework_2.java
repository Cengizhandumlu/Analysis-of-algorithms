public class DynamicArray {
    int array[];
    int n;
    int kapasite;
    //constructor
    public DynamicArray() {
        array = new int[2];// yeni 2 elemanlı boş bir array
        n = 0; // Dizinin içerisindeki eleman sayısı
        kapasite = 2;// Dinamik dizinin kapasitesi
    }

    // Dizimiz de sona eleman eklemek için oluşturulan fonksiyon
    public void append(int eleman) {
        // Dizinin kapasitesi ve eleman sayısı kontrol edildi ve yetersiz olduğu durumda kapasite 2 katına çıkarıldı
        if (n == kapasite) {
            int yeni[] = new int[kapasite * 2];// Yeni eleman ekleneceği için eski kapasitenin 2 katı kadarlık bir dizi
                                               // oluşturuldu.
            for (int i = 0; i < kapasite; i++) {
                yeni[i] = array[i];// array deki elemanlar yeni diziye kopyalandı.
            }
            // kapasite ve yeni değerleri atandı.
            array = yeni;
            kapasite = kapasite * 2;
        }
        // kapasitenin yeterli olduğu durumda eleman eklendi.
        array[n] = eleman;
        n++;
    }

    // Dizimizin son elemanını silen fonksiyonumuz.
    public void remove() {
        if (n > 0) {// Eğer dizimiz de eleman varsa sondan eleman silindi.
            array[n - 1] = 0;
            n--;// Eleman silindiği için dizideki eleman sayısı azaltıldı.
        }
    }

    // Dizimize yeni kapasite vermek için oluşturulan fonksiyonumuz.
    public void resize(int yeni_kapasite) {
        int temp[] = new int[yeni_kapasite];// yeni kapasite vermek için gönderilen parametre kadarlık dizi
                                            // oluşturuldu.
        for (int i = 0; i < kapasite; i++) {
            temp[i] = array[i];// dizi deki elemanlar yeni oluşturulan diziye atandı.
        }
        // Yeni kapasite ataması ve dizi ataması yapıldı.
        array = temp;
        kapasite = yeni_kapasite;
    }

    public static void main(String args[]) {
        DynamicArray array = new DynamicArray();

        System.out.println("Array elaman sayısı:" + array.n + ", Array kapasite: " + array.kapasite);
        //burda dizi sonuna eleman ekelemek için  örnek çağırımlar yapıldı.
        array.append(18);
        array.append(10);
        array.append(6);
        array.append(90);
        array.append(51);
        System.out.println("Array elaman sayısı:" + array.n + ", Array kapasite: " + array.kapasite);
        
        //dizimizin sonundan eleman silmek için örnek çağırımlar yapıldı.
        array.remove();
        array.remove();
        array.remove();
        array.remove();
        array.remove();
        System.out.println("Array elaman sayısı:" + array.n + ", Array kapasite: " + array.kapasite);
        
        //resize fonksiyonu için örnek çağırımlar yapıldı.
        array.resize(15);
        array.resize(20);
        array.resize(25);
        array.resize(30);
        array.resize(35);
        System.out.println("Array elaman sayısı:" + array.n + ", Array kapasite: " + array.kapasite);
    }
}
