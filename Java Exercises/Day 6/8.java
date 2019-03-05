class student{
    private String name;

    student(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

interface Details{
    void details();
}

class person implements Details{

    student student;

    public person(student student){
        this.student = student;
    }
    @Override
    public void details() {
        System.out.println(" Details of Student Accessed ");
    }
}

class student_details_proxy extends person{

    public student_details_proxy(student student) {
        super(student);
    }

    @Override
    public void details() {
        if(student.getName() =="Admin"){
        super.details();
        }
        else{
            System.out.println(" Access Denied ");
        }
    }
}

class Exercise_6_8 {
    public static void main(String[] args) {
        student s = new student("Admin");
        person p = new student_details_proxy(s);
        p.details();

        student s2 = new student("Karan");
        person p2 = new student_details_proxy(s2);
        p2.details();

        person p3 = new person(s2);
        p3.details();
    }
}
