package Labs.lab2;

public abstract class Book {

    protected String author;
    protected String name;
    protected String genre;

    protected Book(String author, String name, String genre) {
        setAuthor(author);
        setName(name);
        setGenre(genre);
    }

    protected void setAuthor(String author) {
        this.author = author;
    }


    protected void setGenre(String genre) {
        this.genre = genre;
    }


    protected void setName(String name) {
        this.name = name;
    }

    public abstract void getInfo();
}
