import java.util.*;

public class DemoPerbedaanCollection {
    public static void main(String[] args) {

        System.out.println("===== DATA DASAR =====");
        List<String> makanan = Arrays.asList("Nasi Goreng", "Sate", "Bakso", "Sate", "Mie Ayam", "Nasi Goreng");
        System.out.println("Data awal: " + makanan);

        System.out.println("\n===== 1. ArrayList =====");
        List<String> arrayList = new ArrayList<>(makanan);
        System.out.println("ArrayList menyimpan semua elemen sesuai urutan dimasukkan:");
        System.out.println(arrayList);

        System.out.println("\n===== 2. LinkedList =====");
        List<String> linkedList = new LinkedList<>(makanan);
        System.out.println("LinkedList juga menyimpan semua elemen berurutan (mirip ArrayList):");
        System.out.println(linkedList);

        System.out.println("\n===== 3. HashSet =====");
        Set<String> hashSet = new HashSet<>(makanan);
        System.out.println("HashSet hanya menyimpan elemen unik dan tidak menjamin urutan:");
        System.out.println(hashSet);

        System.out.println("\n===== 4. TreeSet =====");
        Set<String> treeSet = new TreeSet<>(makanan);
        System.out.println("TreeSet menyimpan elemen unik dan otomatis terurut (abjad):");
        System.out.println(treeSet);

        System.out.println("\n===== 5. HashMap =====");
        Map<Integer, String> hashMap = new HashMap<>();
        for (int i = 0; i < makanan.size(); i++) {
            hashMap.put(i + 1, makanan.get(i));
        }
        System.out.println("HashMap menyimpan pasangan key-value, tapi urutan tidak tetap:");
        System.out.println(hashMap);

        System.out.println("\n===== 6. TreeMap =====");
        Map<Integer, String> treeMap = new TreeMap<>();
        for (int i = 0; i < makanan.size(); i++) {
            treeMap.put(i + 1, makanan.get(i));
        }
        System.out.println("TreeMap menyimpan pasangan key-value dalam urutan key yang terurut:");
        System.out.println(treeMap);

        System.out.println("\n===== KESIMPULAN SINGKAT =====");
        System.out.println("- ArrayList dan LinkedList: menyimpan semua data termasuk duplikat, urut sesuai input.");
        System.out.println("- HashSet: hanya elemen unik, urutan acak.");
        System.out.println("- TreeSet: hanya elemen unik, terurut abjad.");
        System.out.println("- HashMap: pasangan key-value, key tidak berurutan.");
        System.out.println("- TreeMap: pasangan key-value, key terurut.");
    }
}
