class StudentBuilder {
    String fname;
    String lname;
    int roll_no;
    String department;
    boolean ispass;
    int total_marks;

    public StudentBuilder(String fname,int roll_no){
        this.fname = fname;
        this.roll_no = roll_no;
    }

    public String getFname() {
        return fname;
    }

    public StudentBuilder setFname(String fname) {
        this.fname = fname;
        return this;
    }

    public String getLname() {
        return lname;
    }

    public StudentBuilder setLname(String lname) {
        this.lname = lname;
        return this;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public StudentBuilder setRoll_no(int roll_no) {
        this.roll_no = roll_no;
        return this;
    }

    public String getDepartment() {
        return department;
    }

    public StudentBuilder setDepartment(String department) {
        this.department = department;
        return this;
    }

    public boolean isIspass() {
        return ispass;
    }

    public StudentBuilder wasIspass(boolean ispass) {
        this.ispass = ispass;
        return this;
    }

    public int getTotal_marks() {
        return total_marks;
    }

    public StudentBuilder setTotal_marks(int total_marks) {
        this.total_marks = total_marks;
        return this;
    }

    public StudentClass build(){
        return new StudentClass(this);
    }
}

class StudentClass{
    String fname;
    String lname;
    int roll_no;
    String department;
    boolean ispass;
    int total_marks;

    public StudentClass(StudentBuilder sb){
        this.fname = sb.fname;
        this.lname = sb.lname;
        this.roll_no = sb.roll_no;
        this.department = sb.department;
        this.ispass = sb.ispass;
        this.total_marks = sb.total_marks;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean isIspass() {
        return ispass;
    }

    public void setIspass(boolean ispass) {
        this.ispass = ispass;
    }

    public int getTotal_marks() {
        return total_marks;
    }

    public void setTotal_marks(int total_marks) {
        this.total_marks = total_marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", roll_no=" + roll_no +
                ", department='" + department + '\'' +
                ", ispass=" + ispass +
                ", total_marks=" + total_marks +
                '}';
    }
}

class Exercise_6_4 {
    public static void main(String[] args) {
        StudentClass s = new StudentBuilder("Parth",13).
                setLname("Agarwal").
                setTotal_marks(28).
                setDepartment("CSE").
                wasIspass(true).build();
        System.out.println(s);
    }
}
