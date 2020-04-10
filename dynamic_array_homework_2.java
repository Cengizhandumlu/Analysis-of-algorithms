public class DynamicArray {
     // Cengizhan DUMLU 160401088
    int array[];
    int n;
    int ks;
    //constructor
    public DynamicArray() {
        array = new int[2];// yeni 2 elemanlı boş bir array
        n = 0; // Dizinin içerisindeki eleman sayısı
        ks = 2;// Dinamik dizinin kapasitesi
    }

    // Dizimiz de sona eleman eklemek için oluşturulan fonksiyon
    
    //amortized cost
    //yeni eleman eklenmesi için n eleman yeni diziye kopyalanacaktır.

    //2n elemanı eklemek için n adet kopyalama gerekmektedir.

    //2n elemanın eklenmesi için 2n işlem + n adet kopyalama = 3n

    //O(3n/2n) = O(3/2) = O(1)
    public void append(int eleman) {
        // Dizinin kapasitesi ve eleman sayısı kontrol edildi ve yetersiz olduğu durumda kapasite 2 katına çıkarıldı
        if (n == ks) {
            
            
            int yeni[] = new int[ks * 2];// Yeni eleman ekleneceği için eski kapasitenin 2 katı kadarlık bir dizi

                                               // oluşturuldu. ## complexity =>O(n)
          
            for (int i = 0; i < ks; i++) {// ##complexity =>O(n)
                yeni[i] = array[i];// array deki elemanlar yeni diziye kopyalandı.
            }
            // kapasite ve yeni değerleri atandı.
            array = yeni;
            ks = ks * 2;
        }
        // kapasitenin yeterli olduğu durumda eleman eklendi.
        array[n] = eleman;
        n++;
    }

    // Dizimizin son elemanını silen fonksiyonumuz.
    
    // Array' den sondan eleman silmek için
    //amortized cost
    //O(1)
    public void remove() {
        if (n > 0) {// Eğer dizimiz de eleman varsa sondan eleman silindi. ##complexity=>O(5) =>> O(1)
            array[n - 1] = 0;
            n--;// Eleman silindiği için dizideki eleman sayısı azaltıldı.
        }
    }

    // Dizimize yeni kapasite vermek için oluşturulan fonksiyonumuz.
    public void resize(int yeni_ks) {
        int temp[] = new int[yeni_ks];// yeni kapasite vermek için gönderilen parametre kadarlık dizi
                                            // oluşturuldu.
        for (int i = 0; i < ks; i++) {
            temp[i] = array[i];// dizi deki elemanlar yeni oluşturulan diziye atandı.
        }
        // Yeni kapasite ataması ve dizi ataması yapıldı.

        array = temp;

        ks = yeni_ks;
    }

    public static void main(String args[]) {
        DynamicArray array = new DynamicArray();

        System.out.println("elaman sayısı:" + array.n + "  kapasite: " + array.ks);
        //burda dizi sonuna eleman ekelemek için  örnek çağırımlar yapıldı.
        array.append(8);
        array.append(1);
        array.append(6);
        array.append(4);
        array.append(5);
        System.out.println("elaman sayısı:" + array.n + "  kapasite: " + array.ks);
        
        //dizimizin sonundan eleman silmek için örnek çağırımlar yapıldı.
        array.remove();
        array.remove();
        array.remove();
        array.remove();
        array.remove();
        System.out.println("elaman sayısı:" + array.n + "  kapasite: " + array.ks);
        
        //resize fonksiyonu için örnek çağırımlar yapıldı.
        array.resize(15);
        array.resize(16);
        array.resize(22);
        array.resize(28);
        array.resize(45);
        System.out.println("elaman sayısı:" + array.n + "  kapasite: " + array.ks);
    }
}
