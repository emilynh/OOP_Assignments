package exercise_2_1;

public class TestBook {
    public static void main(String[] args){
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck);
        Book dummyBook = new Book("Java for dummy", ahTeck, 19.95, 99);
        System.out.println(dummyBook);

        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + dummyBook.getAuthor());

        System.out.println("Author's name is: " + dummyBook.getAuthorName());
        System.out.println("Author's email is: " + dummyBook.getAuthorEmail());

        Book anotherBook = new Book("more Java", new Author("Paul Tan", "paul@nowhere.com", 'm'), 29.95);
        System.out.println(anotherBook);
    }
}
//Author[name=Tan Ah Teckemail=ahteck@nowhere.comgender=m]
//Book[name=Java for dummy,Author[name=Tan Ah Teck,email=ahteck@nowhere.com,gender=m],price=19.95,qty=99]
//name is: Java for dummy
//price is: 29.95
//qty is: 28
//Author is: Author[name=Tan Ah Teckemail=ahteck@nowhere.comgender=m]
//Author's name is: Tan Ah Teck
//Author's email is: ahteck@nowhere.com
//Book[name=more Java,Author[name=Paul Tan,email=paul@nowhere.com,gender=m],price=29.95,qty=0]
