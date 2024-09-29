package Labs.lab2;

public class AudioBook extends Book {
    private int durationInMinutes;
    private int priceInRoubles;
    private static int counter;

    public AudioBook(String author, String name, String genre, int durationInMinutes, int priceInRoubles) {
        super(author, name, genre);
        setDurationInMinutes(durationInMinutes);
        setPriceInRoubles(priceInRoubles);
        counter++;
    }

    public AudioBook() {
        this("Неизвестен", "Неизвестно", "романтика", 0, 0);
    }

    public void buyAudiobook(int val) {
        if (val < priceInRoubles)
            System.out.println("Не хватает денежных средств: " + (priceInRoubles - val) + "руб");
        else System.out.println("Вы купили аудиокнигу, у вас осталось " + (val - priceInRoubles) + "руб");
    }

    @Override
    public void getInfo() {
        System.out.println("Аудиокнига " + super.getName() + "; Автор " + super.getAuthor() + "; Жанр " + super.getGenre() +
                "; Длительность " + this.durationInMinutes + "; Цена " + this.priceInRoubles);
    }

    public static int getCounter() {
        return counter;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    private void setDurationInMinutes(int duration) {
        durationInMinutes = duration;
    }

    public int getPriceInRoubles() {
        return priceInRoubles;
    }

    private void setPriceInRoubles(int price) {
        priceInRoubles = price;
    }
}
