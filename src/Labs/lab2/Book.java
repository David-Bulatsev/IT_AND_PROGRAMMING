package Labs.lab2;

public abstract class Book {

    private String author;
    private String name;
    private String genre;

    protected Book(String author, String name, String genre) {
        setAuthor(author);
        setName(name);
        setGenre(genre);
    }
    protected Book(){
        this(null, null, null);
    }

    protected void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    protected void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public abstract void getInfo();
}
