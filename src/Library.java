import java.util.HashSet;

public class Library {
    public static void main(String[] args) {
//Use suitable collection to store books by the name booksCollection
        HashSet<Books> booksCollection=new HashSet<>();

        booksCollection.add(new Books(1,"Name1","Author1"));
        booksCollection.add(new Books(2,"Name2","Author1"));
        booksCollection.add(new Books(3,"Name1","Author1"));
        booksCollection.add(new Books(1,"Name4","Author2"));

        for(Books b:booksCollection){
            System.out.println(b);
        }
    }
}