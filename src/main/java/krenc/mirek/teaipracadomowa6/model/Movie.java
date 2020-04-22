package krenc.mirek.teaipracadomowa6.model;

public class Movie {

    private String title;
    private String producer;
    private int year;

    public Movie() {
    }

    public Movie(String tytul, String producer, int year) {
        this.title = tytul;
        this.producer = producer;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "tytul='" + title + '\'' +
                ", producer='" + producer + '\'' +
                ", year=" + year +
                '}';
    }
}
