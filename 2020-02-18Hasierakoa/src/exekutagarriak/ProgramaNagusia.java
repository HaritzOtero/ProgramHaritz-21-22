package exekutagarriak;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import model.Author;
import model.Book;
import model.Komikia;

public class ProgramaNagusia {

    private static Author[] idazleak = new Author[100];
    private static ArrayList<Book> liburutegia = new ArrayList<>();

    public static void initialize() {
        Author author1 = new Author("J.K Rowling",'m');
        author1 = idazleak[0];
        
        Author author2 = new Author("Agatha Christie",'f');
        author2 = idazleak[1];
        
        Author author3 = new Author("Francisco Ibañez",'m');
        author3 = idazleak[2];
        
        Author author4 = new Author("Margaret Atwood",'m');
        author4 = idazleak[3];
        
        Author author5 = new Author("Marjane Satrapi",'f');
        author5 = idazleak[4];
        
        Author author6 = new Author("Mariasun Landa",'f');
        author6 = idazleak[5];
        
        Author author7 = new Author("Harper Lee",'m');
        author7 = idazleak[6];
        
        Author author8 = new Author("Mary Shelley",'f');
        author8 = idazleak[7];
        
        
        liburutegia.add(new Book("Harry Potter", author1 ,99.99, 2850));
        liburutegia.add(new Book("Asesinato en el Orient Express", author2 ,9.95, 275));
        liburutegia.add(new Book("Muerte en el Nilo", author2 ,9.95, 300));
        liburutegia.add(new Book("10 negritos", author2 ,99.99, 325));
        liburutegia.add(new Komikia("Mortadelo y Filemón", author3, 19.95, 75, true));
        liburutegia.add(new Book("El cuento de la criada", author4, 24.95, 410));
        liburutegia.add(new Book("Cats's eye", author4 ,6.95, 78));
        liburutegia.add(new Komikia("Persepolis", author5 ,19.75, 75, false));
        liburutegia.add(new Book("Azken Balada", author6 ,10.95, 225));
        liburutegia.add(new Book("Harry Potter", author7 ,15.95, 450));
        liburutegia.add(new Book("Harry Potter", author8 ,19.95, 300));
    } 
    
    public static void jaiotzeDataBete(){
        
    int posizioa;
        
        
        Scanner in = new Scanner(System.in);
        System.out.println("Zein idazleren jaiotze data nahi duzu bete (Idatzi posizioa)?");
        posizioa = in.nextInt();
        
        System.out.println("Sartu" + idazleak[posizioa - 1].getName() + "idazlearen jaiotze data (uuuu-hh-ee) ");
        String data = in.next();
        idazleak[posizioa - 1].setBirthday(data);
        System.out.println("Jaiotze-data ondo erregistratu da.");
        
        
        
       
    }

    public static void inprimatu(){
        System.out.println("LIBURUTEGIA");
        System.out.println("===============================");
        for (Book b:liburutegia){
            System.out.println(b);
        }
    }
    public static void main(String[] args) {

        initialize();
        jaiotzeDataBete();
        inprimatu();
       
    }

}
