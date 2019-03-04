class employee {

    String name;
    Integer age;
    String city;

    public employee(String name, Integer age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
}

interface employee_Interface {
    employee init(String name, Integer age, String city);
}

class Exercise_5_4 {

    public static void main(String[] args) {
        employee_Interface empInterface = employee::new;
        employee emp = empInterface.init("ABC", 29, "Delhi");
    }
}


