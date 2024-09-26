package Labs.lab2;

public class Musical extends Book {
    private double durationInHours;
    private int ticketPrice;
    private String address;


    public Musical(String author, String name, String genre, String address, double duration, int ticketPrice) {
        super(author, name, genre);
        setAddress(address);
        setDurationInMinutes(duration);
        setTicketPrice(ticketPrice);
        setAuthor(author);
        setName(name);
        setGenre(genre);

    }

    public Musical() {
        this("Неизвестен", "Неизвестно", "романтика", "Улица пушкина", 0, 0);
    }


    public void buyTickets(int val) {
        if (val < ticketPrice)
            System.out.println("Не хватает денежных средств: " + (ticketPrice - val) + "руб");
        else System.out.println("Вы купили билет, у вас осталось " + (val - ticketPrice) + "руб");
    }

    @Override
    public void getInfo() {
        System.out.println("Мюзикл " + super.name + "; Автор " + super.author + "; Жанр " + super.genre +
                "; Продолжительность " + this.durationInHours + "; Адрес " + address + "; Цена " + this.ticketPrice);
    }


    private void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    private void setDurationInMinutes(double durationInMinutes) {
        this.durationInHours = durationInMinutes;
    }

    public double getDurationInMinutes() {
        return durationInHours;
    }

    private void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }
}
