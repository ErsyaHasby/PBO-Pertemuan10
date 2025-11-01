import java.util.*;

public class CountrySetExample {
    public static void main(String[] args) {
        Set<String> countries = new HashSet<>();

        countries.add("Indonesia");
        countries.add("Japan");
        countries.add("USA");
        countries.add("France");
        countries.add("Germany");
        countries.add("Indonesia"); // duplikat, akan diabaikan

        System.out.println("Daftar negara: " + countries);
    }
}
