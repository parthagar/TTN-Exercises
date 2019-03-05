import java.util.ArrayList;
import java.util.Date;

class Book{
    int libraryId;
    String title;
    Date issueDate;
    Date dueDate;
    int IssuedToCustomerId;
    String ISBN;
    int accessLevelRequired;

    @Override
    public String toString() {
        return "Book{" +
                "libraryId=" + libraryId +
                ", title='" + title + '\'' +
                ", issueDate=" + issueDate +
                ", dueDate=" + dueDate +
                ", IssuedToCustomerId=" + IssuedToCustomerId +
                ", ISBN='" + ISBN + '\'' +
                ", accessLevelRequired=" + accessLevelRequired +
                '}';
    }
}

class Customer {
    int CustomerId;
    float fine;
    int numberOfBooksIssued;

    @Override
    public String toString() {
        return "Customer{" +
                "CustomerId=" + CustomerId +
                ", fine=" + fine +
                ", numberOfBooksIssued=" + numberOfBooksIssued +
                '}';
    }
}

abstract class Staff{
    String name;
    int empId;
    int accessLevel;

    abstract Book issueBook(int libraryId, int accessLevelRequired);
    abstract void addBook(int Book);
    abstract void showDetails();

}

class Library{
    static ArrayList<Book> books = new ArrayList<>();

    void showLibraryStatus(){}
}
