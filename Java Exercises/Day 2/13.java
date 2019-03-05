class customException extends Exception {
    public customException(String s) {
        super(s);
        this.setStackTrace(new StackTraceElement[0]);
    }
}

class Exercise_2_13 {

    public static void main(String[] args) {
        try {
            throw new customException("This is a custom exception without any stackTrace");
        }
        catch (customException errorobj) {
            errorobj.printStackTrace();
            System.out.println("Exception caught");
        }
    }
}
