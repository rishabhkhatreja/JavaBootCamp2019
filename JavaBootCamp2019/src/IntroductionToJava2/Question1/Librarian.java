package IntroductionToJava2.Question1;

public class Librarian {
    String name;
    String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    void searchBook(int bookid)
    {

    }
    void  deleteStudent(Person p)
    {

    }
    void updateStudentRecord(Person p)
    {

    }
    void  issueBook(int id)
    {

    }
    void updateBookDetails(Book bookObject) {

    }
    void listBooks()
    {

    }
    void getMemberdetail(Person s)
    {

    }
    void collectfine(Person s)
    {

    }
}



/*

issue book logic...!


int temp=0;
        if(searchBook(id))
        {
            for (Book object : new Racks().books) {
                if (id == object.bookId) {
                    if(object.noOfCopies>=1)
                    {
                        object.noOfCopies=object.noOfCopies-1;
                        temp=1;
                        break;
                    }
                }
            }
        }
        if(temp==1)
        {
            return true;
        }
        else
        {
            return false;
        }*/

/*

Search book logic......!
int temp = 0;

        for (Book object : new Racks().books) {
            if (bookid == object.bookId) {
                temp = 1;
                System.out.println("book exist");
                System.out.print(object.bookId+" "+object.bookName+" "+object.author+" "+object.noOfCopies+" "+object.price);
            break;
            }
        }
        if (temp == 0)
        {
            System.out.println("book does not exist");
            return true;
        }
        else
        {
            return false;
        }*/
