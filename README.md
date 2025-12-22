# 📚 PBO-Pertemuan10

Tugas pertemuan ke-10 mata kuliah **Pemrograman Berorientasi Objek (PBO)** yang membahas tentang **Java Collection Framework**.

## 📋 Daftar Isi

- [Deskripsi](#deskripsi)
- [Struktur Proyek](#struktur-proyek)
- [Materi yang Dipelajari](#materi-yang-dipelajari)
- [Demo Collection](#demo-collection)
- [Task 1 - ArrayList & Vector](#task-1---arraylist--vector)
- [Task 2 - Stack & HashSet](#task-2---stack--hashset)
- [Cara Menjalankan](#cara-menjalankan)
- [Kesimpulan](#kesimpulan)

## 📖 Deskripsi

Repository ini berisi implementasi berbagai struktur data dalam Java Collection Framework. Proyek ini dibuat untuk memahami perbedaan dan penggunaan masing-masing tipe collection dalam Java.

## 📁 Struktur Proyek

```
PBO-Pertemuan10/
├── DemoPerbedaanCollection.java    # Demo perbedaan berbagai collection
├── task-1/
│   └── src/
│       ├── Student.java            # Class model Student
│       └── Main.java               # Implementasi ArrayList & Vector
├── task-2/
│   └── src/
│       ├── ArrayStack.java         # Implementasi Stack dengan Generic
│       └── CountrySetExample.java  # Contoh penggunaan HashSet
└── README.md
```

## 📚 Materi yang Dipelajari

### Java Collection Framework

| Collection | Karakteristik |
|------------|---------------|
| **ArrayList** | Menyimpan elemen berurutan, akses cepat via index, duplikat diperbolehkan |
| **LinkedList** | Menyimpan elemen berurutan, optimal untuk insert/delete di tengah |
| **Vector** | Mirip ArrayList, thread-safe (synchronized) |
| **HashSet** | Hanya menyimpan elemen unik, urutan tidak dijamin |
| **TreeSet** | Hanya menyimpan elemen unik, otomatis terurut |
| **HashMap** | Menyimpan pasangan key-value, urutan tidak dijamin |
| **TreeMap** | Menyimpan pasangan key-value, key terurut |

## 🎮 Demo Collection

File `DemoPerbedaanCollection.java` mendemonstrasikan perbedaan 6 tipe collection dengan data makanan Indonesia:

```java
List<String> makanan = Arrays.asList("Nasi Goreng", "Sate", "Bakso", "Sate", "Mie Ayam", "Nasi Goreng");
```

**Output yang dihasilkan:**

| Collection | Output |
|------------|--------|
| ArrayList | `[Nasi Goreng, Sate, Bakso, Sate, Mie Ayam, Nasi Goreng]` |
| LinkedList | `[Nasi Goreng, Sate, Bakso, Sate, Mie Ayam, Nasi Goreng]` |
| HashSet | `[Bakso, Sate, Nasi Goreng, Mie Ayam]` (urutan acak, tanpa duplikat) |
| TreeSet | `[Bakso, Mie Ayam, Nasi Goreng, Sate]` (terurut abjad, tanpa duplikat) |
| HashMap | `{1=Nasi Goreng, 2=Sate, ...}` (key tidak berurutan) |
| TreeMap | `{1=Nasi Goreng, 2=Sate, ...}` (key terurut) |

## 📝 Task 1 - ArrayList & Vector

### Deskripsi
Implementasi manajemen data mahasiswa menggunakan **ArrayList** dan **Vector**.

### Class Student
Model data mahasiswa dengan atribut:
- `studentID` - ID mahasiswa (int)
- `name` - Nama mahasiswa (String)
- `department` - Jurusan (String)
- `address` - Alamat (String)

### Fitur yang Diimplementasi

#### 1. ArrayList dengan Sorting
```java
ArrayList<Student> studentList = new ArrayList<>();
// Menambahkan data mahasiswa
Collections.sort(studentList, Comparator.comparing(Student::getName));
```
Mengurutkan data mahasiswa berdasarkan nama secara ascending.

#### 2. Vector dengan Filtering
```java
Vector<Student> studentVector = new Vector<>();
// Filter berdasarkan department
for (Student s : studentVector) {
    if (s.getDepartment().equalsIgnoreCase("Computer Science")) {
        System.out.println(s);
    }
}
```
Memfilter mahasiswa berdasarkan jurusan Computer Science.

### Contoh Output
```
=== Sorted Students (ArrayList) by Name ===
101 - Boaz - Computer Science - Papua
105 - Haye - Accounting - Semarang
103 - Kambuaya - Computer Science - Maluku
104 - Konate - Civil Engineering - Bandung
102 - Ponaryo - Mechanical Engineering - Palembang

=== Students in Computer Science Department (Vector) ===
201 - Shin Tae Yong - Computer Science - Korea
203 - Bojan Hodak - Computer Science - Kroasia
205 - Luis Milla Aspas - Computer Science - Spanyol
```

## 📝 Task 2 - Stack & HashSet

### 1. ArrayStack (Generic Stack)
Implementasi struktur data **Stack** menggunakan ArrayList dengan dukungan **Generic**.

```java
public class ArrayStack<T> {
    private ArrayList<T> items;
    
    public void push(T item);    // Menambah elemen ke stack
    public T pop();              // Mengambil dan menghapus elemen teratas
    public boolean isEmpty();    // Mengecek apakah stack kosong
}
```

**Fitur:**
- Menggunakan Generic `<T>` sehingga dapat menyimpan tipe data apapun
- Throw `ArrayStackException` ketika pop pada stack kosong (Underflow)

**Contoh Penggunaan:**
```java
ArrayStack<Integer> stack = new ArrayStack<>();
stack.push(1);
stack.push(2);
stack.push(3);
System.out.println(stack.pop()); // Output: 3 (LIFO)
System.out.println(stack.pop()); // Output: 2
System.out.println(stack.pop()); // Output: 1
```

### 2. CountrySetExample (HashSet)
Contoh penggunaan **HashSet** untuk menyimpan daftar negara tanpa duplikasi.

```java
Set<String> countries = new HashSet<>();
countries.add("Indonesia");
countries.add("Japan");
countries.add("USA");
countries.add("France");
countries.add("Germany");
countries.add("Indonesia"); // duplikat, akan diabaikan

System.out.println("Daftar negara: " + countries);
// Output: [USA, France, Japan, Indonesia, Germany] (urutan acak)
```

## 🚀 Cara Menjalankan

### Prasyarat
- Java JDK 8 atau lebih baru
- IDE (IntelliJ IDEA / Eclipse / VS Code) atau Terminal

### Menjalankan Demo Collection
```bash
cd PBO-Pertemuan10
javac DemoPerbedaanCollection.java
java DemoPerbedaanCollection
```

### Menjalankan Task 1
```bash
cd task-1/src
javac Student.java Main.java
java Main
```

### Menjalankan Task 2 - ArrayStack
```bash
cd task-2/src
javac ArrayStack.java
java ArrayStack
```

### Menjalankan Task 2 - CountrySetExample
```bash
cd task-2/src
javac CountrySetExample.java
java CountrySetExample
```

## 📊 Kesimpulan

| Collection | Duplikat | Urutan | Akses | Use Case |
|------------|----------|--------|-------|----------|
| **ArrayList** | ✅ Ya | Sesuai input | Index O(1) | List dengan akses random |
| **LinkedList** | ✅ Ya | Sesuai input | Index O(n) | Insert/delete di tengah |
| **Vector** | ✅ Ya | Sesuai input | Index O(1) | Thread-safe list |
| **HashSet** | ❌ Tidak | Tidak dijamin | O(1) | Mengecek keberadaan elemen |
| **TreeSet** | ❌ Tidak | Terurut | O(log n) | Set yang perlu diurutkan |
| **HashMap** | Key unik | Tidak dijamin | O(1) | Key-value lookup |
| **TreeMap** | Key unik | Key terurut | O(log n) | Sorted key-value |

---

## 👨‍💻 Informasi Mata Kuliah

- **Mata Kuliah:** Pemrograman Berorientasi Objek (PBO)
- **Pertemuan:** 10
- **Institusi:** POLBAN (Politeknik Negeri Bandung)
- **Semester:** 3

---

*Repository ini dibuat sebagai bagian dari tugas mata kuliah PBO Semester 3*
