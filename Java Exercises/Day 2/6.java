class Exercise_2_6{

    public static void main(String[] args) {

        try{
            int[] arr = new int[10];
            int temp;
            for(int i = 0; i < 10; i++){
                temp = arr[i] / (9 - i);
            }
        }
        catch (ArrayIndexOutOfBoundsException idxerror){
            idxerror.printStackTrace();
        }
        catch (ArithmeticException matherror){
            matherror.printStackTrace();
        }

        finally {
            System.out.println("Wow! You really must be something to produce these errors.");
        }

    }
}