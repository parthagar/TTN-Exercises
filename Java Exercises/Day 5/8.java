interface Helper1{
    default int add(int a, int b){
        return a + b + 1;
    }
}

interface Helper2{
    default int add(int a, int b){
        return a + b + 2;
    }
}

class Exercise_5_8 implements Helper1, Helper2 {
    @Override
    public int add(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {

        Exercise_5_8 exercise_5_8 = new Exercise_5_8();
        System.out.println(exercise_5_8.add(4, 5));

    }
}
