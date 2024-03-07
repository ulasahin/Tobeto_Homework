public class Main {
    public static void main(String[] args) {
        String student0 = "Tolga";
        String student1 = "Roy";
        String student2 = "Gürkan";
        String student3 = "Ulaş";

        System.out.println(student0);
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println("---------------------------------------");
        String[] students = new String[4];
        students[0] = "Tolga";
        students[1] = "Roy";
        students[2] = "Gürkan";
        students[3] = "Ulaş";

        /*for (int i=0; i<students.length;i++){
            System.out.println(students[i]);
        }*/
        for (String student:students){
            System.out.println(student);
        }

    }
}