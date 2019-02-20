class Exercise_10 {

    static int add(int a, int b){return a + b;}

    static double add(double a, double b){return a + b;}

    static float multiply(float a, float b){return a * b;}

    static int multiply(int a, int b){return a * b;}

    static String concat(String a, String b){return a + b;}
     
    static String concat(String a, String b, String c){return a + b + c;}

    public static void main(String[] args) {

        System.out.println(add(20, 30));
        System.out.println(add(25.5, 31.1));
        System.out.println(multiply(2, 3));
        System.out.println(multiply(22.7f, 31.1f));
        System.out.println(concat("abc", "def"));
        System.out.println(concat("abc", "def", "ghi"));

    }
}
