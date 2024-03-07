public class Main {
    public static void main(String[] args) {
         int x = 20;
         int y = 25;
         int z = 5;

         int largestNumber = x;

         if (largestNumber < y){
             largestNumber = y;
         }
         if (largestNumber < z){
             largestNumber = z;
         }
        System.out.println("En Büyük Sayı : " +  largestNumber);
    }
}