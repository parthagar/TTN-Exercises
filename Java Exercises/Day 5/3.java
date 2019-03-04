@FunctionalInterface
interface Operation{
    int doIt(int a, int b);
}

class Exercise_5_3 {

    static int mul(int a, int b){
        return a * b;
    }

    public static void main(String[] args) {

        Operation addByInterface = (a, b) -> a + b;
        System.out.println(addByInterface.doIt(4, 5));

        Operation subByInterface = (a, b) -> a - b;
        System.out.println(subByInterface.doIt(4,5));

        Operation mulByStatic = Exercise_5_3::mul;
        System.out.println(mulByStatic.doIt(4, 5));

    }
}
