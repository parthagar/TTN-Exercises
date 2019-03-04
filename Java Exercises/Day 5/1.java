@FunctionalInterface
interface Compare{
    boolean compare(int a, int b);
}

@FunctionalInterface
interface Increment{
    int increment(int a);
}

@FunctionalInterface
interface Concatenate{
    String concat(String str1, String str2);
}

@FunctionalInterface
interface ToUpperCase{
    String toUpper(String str);
}

class Exercise_5_1 {

    public static void main(String[] args) {

        Compare compare = (a, b) -> a > b;
        System.out.println(compare.compare(1, 2));

        Increment increment = (a -> a + 1);
        System.out.println(increment.increment(4));

        Concatenate concatenate = (str1, str2) -> str1 + str2;
        System.out.println(concatenate.concat("abc", "def"));

        ToUpperCase toUpperCase = (str) -> str.toUpperCase();
        System.out.println(toUpperCase.toUpper("AbCdEf"));
    }
}
