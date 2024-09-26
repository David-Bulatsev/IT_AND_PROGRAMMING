package Labs.lab2;

public class Film extends Book {
    private byte numberOfParts;
    private String basedOn;
    private float ratingOnKinopoisk;

    public Film(String author, String name, String genre, byte numberOfParts, String basedOn, float ratingOnKinopoisk) {
        super(author, name, genre);
        setNumberOfParts(numberOfParts);
        setBasedOn(basedOn);
        setRatingOnKinopoisk(ratingOnKinopoisk);
    }

    public Film() {
        this("Неизвестен", "Неизвестно", "романтика", (byte) 1, "Книга", 0.0f);
    }

    public void feedBack(float grade) {
        float newGrade = ((ratingOnKinopoisk / grade) / 10);
        float lastRating = ratingOnKinopoisk;
        if (grade < ratingOnKinopoisk)
            this.ratingOnKinopoisk -= newGrade;
        else
            this.ratingOnKinopoisk += newGrade;
        System.out.println("Вы повлияли на рейтинг фильма. " + lastRating + " => " + ratingOnKinopoisk);
    }

    @Override
    public void getInfo() {
        System.out.println("Фильм " + super.name + "; Автор " + super.author + "; Жанр " + super.genre +
                "; Количество частей " + this.numberOfParts + "; Основан на " + this.basedOn + "; Оценка на кинопоиске " + ratingOnKinopoisk);
    }


    public byte getNumberOfParts() {
        return numberOfParts;
    }

    private void setNumberOfParts(byte numberOfParts) {
        this.numberOfParts = numberOfParts;
    }

    public String getBasedOn() {
        return basedOn;
    }

    private void setBasedOn(String basedOn) {
        this.basedOn = basedOn;
    }

    public float getRatingOnKinopoisk() {
        return ratingOnKinopoisk;
    }

    private void setRatingOnKinopoisk(float ratingOnKinopoisk) {
        this.ratingOnKinopoisk = ratingOnKinopoisk;
    }
}
