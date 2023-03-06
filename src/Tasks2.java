public class Tasks2 {
    public static void main(String[] args) {
        int a = 100;
        int b = 14;
        int result = a + b;
        int result1 = a * b;
        int result2 = a - b;
        int result3 = a / b;

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        //System.out.println((double)a / b);// если нужно перевести в double плохая практика или можно + 0.0
        System.out.println( a % b );// остаток от деления
        System.out.println(" a is odd - > 0  " + a % 2 );// проверка на четность
        System.out.println(" b is odd - > 0  " + b % 2 );



        System.out.println(result3);
        if ( result3 % 2 == 0 )
        System.out.println(" Четное число");
        else
        System.out.println(" Нечетное число");


        String grinningFace = "😀";
        String grinningFace1 = "😁";


        System.out.println(grinningFace);
        System.out.println(grinningFace1);
        System.out.println("\uD83D\uDE00");









    }
}
