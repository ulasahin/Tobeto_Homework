public class Main {
    public static void main(String[] args) {
        char character = 'İ';

        switch (character) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın Sesli Harftir.");
                break;
            default:
                System.out.println("İnce Sesli Harftir.");
        }
    }
}