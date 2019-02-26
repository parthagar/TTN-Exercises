import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{

    Double Age;
    Double Score;
    String Name;

    Student(Double age, Double score, String name){
        this.Age = age;
        this.Score = score;
        this.Name = name;
    }

    public static void main(String[] args) {
        ArrayList<Student> stdArr = new ArrayList<>();
        stdArr.add(new Student(24.0, 500.0, "Jay"));
        stdArr.add(new Student(21.0, 400.0, "Veeru"));
        stdArr.add(new Student(20.0, 400.0, "Basanti"));
        stdArr.add(new Student(20.0, 400.0, "Gabbar"));

        Collections.sort(stdArr, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2){
                if(s1.Score < s2.Score)
                    return 0;
                else if(s1.Score.equals(s2.Score))
                    return (s1.Name).compareTo(s2.Name);
                else
                    return 1;
            }
        });

        for(Student e: stdArr){
            System.out.println("Name: " + e.Name + ", Age: " + e.Age + ", Score: " + e.Score);
        }
    }
}
