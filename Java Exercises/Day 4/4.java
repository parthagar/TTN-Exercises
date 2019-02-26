import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee implements Comparator<Employee> {

    Double Age;
    Double Salary;
    String Name;

    Employee(){}

    Employee(Double age, Double salary, String name){
        this.Age = age;
        this.Salary = salary;
        this.Name = name;
    }

    public int compare(Employee e1, Employee e2){
        if(e1.Salary < e2.Salary)
            return 1;
        else
            return -1;
    }

    public static void main(String[] args) {
        ArrayList<Employee> empArr = new ArrayList<>();
        empArr.add(new Employee(40.0, 50000.0, "Jay"));
        empArr.add(new Employee(50.0, 20000.0, "Veeru"));
        empArr.add(new Employee(30.0, 35000.0, "Basanti"));

        Collections.sort(empArr, new Employee());

        for(Employee e: empArr){
            System.out.println("Name: " + e.Name + ", Age: " + e.Age + ", Salary: " + e.Salary);
        }
    }
}
