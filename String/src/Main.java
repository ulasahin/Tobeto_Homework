public class Main {
    public static void main(String[] args) {
        String message = "Bugün hava çok güzel.";
        int sayi = 10;
        
        System.out.println(sayi);

        System.out.println(message);
        System.out.println("Eleman sayısı : " + message.length());
        System.out.println("5. eleman : " + message.charAt(4));
        System.out.println(message.concat("Yaşasın!!"));
        System.out.println(message.startsWith("B"));
        System.out.println(message.endsWith("."));
        char[] characters = new char[5];
        message.getChars(0,5,characters,0);
        System.out.println(characters);
        System.out.println(message.indexOf('a'));
        System.out.println(message.lastIndexOf("a"));


    }
}
