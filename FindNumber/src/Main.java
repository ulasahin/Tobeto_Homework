public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,3,4,5,6,7,8,9,0};
        int findNumber = 11;
        boolean isFind = false;

        for(int number : numbers){
            if(number == findNumber){
                isFind = true;
                break;
            }
        }
        if(isFind){
            System.out.println("'" + findNumber + "'" + " Sayısı mevcuttur." );
        }else{
            System.out.println("'" + findNumber + "'" + " Sayısı mevcut değildir." );
        }
    }
}