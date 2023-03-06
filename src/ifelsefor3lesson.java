public class ifelsefor3lesson {
    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        //if (1==2) {
        if (a % 2 == 0) {
            System.out.println("четное");
        }
        /*else {
        b = 1;
        if ( a % 2 != 0) {
            System.out.println(" не четное ");}
        if ( a == 3) {
                System.out.println("a = " +  3);
        }
        else {
            System.out.println( "a не равно 3");
            } */
        else  if (a != 3) {
            System.out.println( "a > 1");
        }
        else {
            System.out.println( " da");
        }




            /*
        a > b     логические операторы сравнения выводят true или false
        a >= b
        a == b
        a != b
        a ,= b
        a < b
                */


       /* System.out.println( "true && false = " + (true && false));
        System.out.println( "true && true = " + (true && true));
        System.out.println( "false && true = " + (false && true));
        System.out.println( "false && false = " + (false && false));


        System.out.println( "true || false = " + (true || false));
        System.out.println( "true || true = " + (true || true));
        System.out.println( "false|| true = " + (false || true));
        System.out.println( "false|| false = " + (false || false));

        System.out.println( ( a % 2 == 0 && a < 5 ));*/
        System.out.println( !( 3 < 2 ));
        //int i = 20;


        for (int i = 1; i < 5; i = i + 1) {
            System.out.println(i);

        }
        //System.out.println(i);

    }
}
