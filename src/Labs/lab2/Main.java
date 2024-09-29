package Labs.lab2;

public class Main {
    public static void main(String[] args) {
        AudioBook ab = new AudioBook("david", "brirvbr", "любовб", 2024, 2040);
        AudioBook ab2 = new AudioBook();
        ab.buyAudiobook(2020);
        ab.buyAudiobook(2044);
        System.out.println(AudioBook.getCounter());
//        ab.setAuthor("ytajh");
//
//        ab.setName("тфафв");
//        ab.getInfo();

        Musical mus = new Musical();
        mus.getInfo();
//        Film film = new Film("David", "Хатико", "Драма", (byte) 1, "Реальные события", 8.5f);
//        film.getInfo();
//        film.feedBack(9);
//        Musical
    }
}
