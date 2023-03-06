public class lesson4 {
    public static void main(String[] args) {
        for (int i = 0; i < 5 && i == 3; i= i + 1){
            System.out.println("Hi");
            System.out.println(i);
        }
        System.out.println("end");
        for (int i = 0; i < 5; i= i + 3 ){
            System.out.println("Hi");
            System.out.println(i);
        }
        System.out.println("end");

        int i = 0;
        while (i < 5) {
            System.out.println(i);
            System.out.println("Hello");
            i = i + 1;

        }
        System.out.println();

        do {
            System.out.println( " Daria");
        } while ( i == 0);
    }
}
