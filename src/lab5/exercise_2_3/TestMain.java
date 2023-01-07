package exercise_2_3;

public class TestMain {
    public static void main(String[] args) {
        Author author1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        System.out.println(author1);

        author1.setEmail("ahteck@somewhere.com");
        System.out.println(author1);
        System.out.println("name is: " + author1.getName());
        System.out.println("email is: " + author1.getEmail());

        Book book1 = new Book("12345", "Java for dummies", author1, 8.8, 88);
        System.out.println(book1);
        book1.setPrice(9.9);
        book1.setQty(99);
        System.out.println(book1);
        System.out.println("isbn is: " + book1.getIsbn());
        System.out.println("name is: " + book1.getName());
        System.out.println("price is: " + book1.getPrice());
        System.out.println("aty is: " + book1.getQty());
        System.out.println("author is: " + book1.getAuthor());

        System.out.println("author's name: " + book1.getAuthorName());
        System.out.println("author's email: " + book1.getAuthorEmail());
    }
}
//Author[name='Tan Ah Teck, email='ahteck@nowhere.com]
//Author[name='Tan Ah Teck, email='ahteck@somewhere.com]
//name is: Tan Ah Teck
//email is: ahteck@somewhere.com
//Book[isbn='12345, name='Java for dummies, author=Author[name='Tan Ah Teck, email='ahteck@somewhere.com], price=8.8, qty=88]
//Book[isbn='12345, name='Java for dummies, author=Author[name='Tan Ah Teck, email='ahteck@somewhere.com], price=9.9, qty=99]
//isbn is: 12345
//name is: Java for dummies
//price is: 9.9
//aty is: 99
//author is: Author[name='Tan Ah Teck, email='ahteck@somewhere.com]
//author's name: Tan Ah Teck
//author's email: ahteck@somewhere.com