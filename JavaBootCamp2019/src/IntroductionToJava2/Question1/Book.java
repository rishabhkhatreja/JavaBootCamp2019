package IntroductionToJava2.Question1;

public class Book {
    int bookId;
    String bookName;
    String author;
    int price;
    int noOfCopies;
    String rackname;
    void setBook(int bookId, String bookName, String author, int price,int noOfCopies)
    {
        this.bookId=bookId;
        this.bookName=bookName;
        this.author=author;
        this.price=price;
        this.noOfCopies=noOfCopies;

    }
    void display(Book book)
    {

    }

}

/*
update book...!
int temp = 0;
        for (Book object : new Racks().books) {
            if (bookObject.bookId == object.bookId) {
                temp = 1;
                System.out.println("book has been found please enter what field you want to update 1 for bookname 2 for author 3 for price 4 for no of copies.");
            }
        }
        if (temp == 0)
        {
            System.out.println("book does not exist");
        }*/
/*
System.out.println("no of books exits in the library are:");
        for (Book object:new Racks().books) {
            System.out.print(object.bookId+" "+object.bookName+" "+object.author+" "+object.noOfCopies+" "+object.price);
        }
 */