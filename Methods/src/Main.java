public class Main {
    public static void main(String[] args) {
        findNumber();
    }
    public static void findNumber(){
        int[] numbers = new int[]{1,2,3,4,5,6,7,8,9,0};
        int findNumber = 2;
        boolean isFind = false;

        for(int number : numbers){
            if(number == findNumber){
                isFind = true;
                break;
            }
        }
        if(isFind){
            message("'" + findNumber + "'" + " Sayısı mevcuttur.");
        }else{
            message("'" + findNumber + "'" + " Sayısı mevcut değildir." );
        }
    }
    public static void message(String message){
        System.out.println(message);
    }
}