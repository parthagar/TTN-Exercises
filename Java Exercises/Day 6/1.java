class dbConnection{

    static dbConnection dbvariable;

    private dbConnection(){
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Run Thread 1");
            }
        });
    }

    static dbConnection getInstance(){
        if(dbvariable == null){
            dbvariable = new dbConnection();
        }
        return dbvariable;
    }
}

class Exercise_6_1 {

    public static void main(String[] args) {
        dbConnection d = dbConnection.getInstance();
        dbConnection e = dbConnection.getInstance();
        System.out.println(d);
        System.out.println(e);
    }
}
