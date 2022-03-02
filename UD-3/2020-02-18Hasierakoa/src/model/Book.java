package model;

import java.time.LocalDate;

/*
 * The Book class models a book with one (and only one) author.
 */
public class Book implements Argitagarria {
    // The private instance variables

    private String name;
    private Author author;
    private double price;
    private int pages;
    protected int argitaratutakoLiburuak = 0;
    protected Hizkuntzak hizkuntzak;
    // Constructors
    public Book() {

    }

    public Book(String name, Author author, double price, int pages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.pages = pages;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;  // return member author, which is an instance of the class Author
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return name + ", " + author.getName() + ", " + price + ", " + pages;
    }

    public String getNolakoa() {
        String i = null;
        if (pages > 100) {
            i = "TXIKIA";
        }

        if (pages > 200 && pages < 100) {
            i = "handia";
        }
        
        if (pages > 300 && pages < 200 ) {
            i = "handia";
        }
        return i;
       
    }

    @Override
    public void argitaratu() {
        
        System.out.println("Eibarren argitaratua" + LocalDate.now() + " egunean" );
        argitaratutakoLiburuak++;
    }
    
    public void argitaratuHizkuntzak(){
        if(this.hizkuntzak == Hizkuntzak.EN){
            System.out.println("Eibarren argitaratua" + LocalDate.now() + " egunean" + " Inglesez" );
            argitaratutakoLiburuak++;
        }
        
        if(this.hizkuntzak == Hizkuntzak.ES){
            System.out.println("Eibarren argitaratua" + LocalDate.now() + " egunean" + " Gaztelaniaz" );
            argitaratutakoLiburuak++;
        }
        
        if(this.hizkuntzak == Hizkuntzak.EU){
            System.out.println("Eibarren argitaratua" + LocalDate.now() + " egunean" + " Euskeraz" );
            argitaratutakoLiburuak++;
        }
    }
}
