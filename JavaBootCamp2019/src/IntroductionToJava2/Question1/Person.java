package IntroductionToJava2.Question1;

import java.util.Date;

public class Person {
    String name;
    int rollNumber;
    String Course;
    String emailID;
    Date dateOfMembership;
    int maxNumberOfBooksCanIssued;
    String[] numberOfBooksIssued=new String[maxNumberOfBooksCanIssued];
    void addPerson(String name,int rollNumber,String course,String email,Date dateOfMembership)
    {
        this.name=name;
        this.rollNumber=rollNumber;
        this.Course=course;
        this.emailID=email;
        this.dateOfMembership=dateOfMembership;
    }
    void requestBook(int bookid)
    {

    }
    void returnBook()
    {

    }

    void payFine()
    {

    }
    void search(int bookid)
    {

    }
    void update()
    {

    }
    void listIssuedBook()
    {

    }
}


/*

 Search book..!
 Boolean b=new Librarian().searchBook(bookid);
        if(b)
        {
            System.out.println("book exist");
        }
        else
        {
            System.out.println("book not exit");
        }*/

/*
Request book logic..!
boolean b=new Librarian().issueBook(bookid);
        if(b)
        {
            ++this.numberOfBooksIssued;
            System.out.println("book has been issued");
        }
        else
        {
            System.out.println("book cannot be issued");
        }
 */
/*
return book
 System.out.println("you have issued these books");
        System.out.println(this.numberOfBooksIssued);
 */