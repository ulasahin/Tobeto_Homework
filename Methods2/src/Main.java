public class Main {
    public static void main(String[] args) {
        String message = "bugün hava çok güzel.";
        String newMessage = giveCity();
        System.out.println(newMessage);
        int number =  sum(5,7);
        System.out.println(number);
        int numbersSum = sum2(2,3,4,5,6,7,8,9);
        System.out.println(numbersSum);
    }
    public static void add(){
        System.out.println("Eklendi");
    }
    public static void delete(){
        System.out.println("Silindi");
    }
    public static void update(){
        System.out.println("Güncellendi");
    }
    public static int sum(int number1 , int number2){
        return number1 + number2;
    }
    public static int sum2(int... numbers ){
         int total = 0;
         for(int number : numbers){
             total += number;
         }
         return total;
    }
    public static String giveCity(){
        return "Ankara";
    }
}