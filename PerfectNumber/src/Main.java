public class Main {
    public static void main(String[] args) {
        int number = 22;
        int total = 0;

        for (int i = 1; i<number; i++){
            if(number % i == 0){
                total = total + i;

            }
        }
        if (total == number){
            System.out.println("'" + number + "'" + " Mükemmel Sayıdır.");
        }else{
            System.out.println("'" + number + "'" + " Mükemmlel Sayı Değildir.");
        }
    }
}