public class Main{
    public static void main(String[] args){
        String str = "Assalamu'alaikum, perkenalkan nama saya Nur Annisa Balqis";

        int panjangString = str.length();
        System.out.println("Panjang stringnya adalah " + panjangString + " karakter.");
        
        char karakterPertama = str.charAt(0);
        System.out.println("\nKarakter pertama: " + karakterPertama);

        String substring = str.substring(0, 25);
        System.out.println("\nSubstringnya adalah : " + substring);

        boolean memiliki = str.contains("saya");
        System.out.println("\nSubstring memiliki kata 'saya': " + memiliki);

        String UpperCase = str.toUpperCase();
        System.out.println("\nHuruf kapital: " + UpperCase);

        String LowerCase = str.toLowerCase();
        System.out.println("\nHuruf kecil: " + LowerCase);

        String terbaru = str.replace ("Assalamu'alaikum", "Halo");
        System.out.println("\nString yang telah diganti: " + terbaru);
    }
}