public class Movie {
    private String name;
    private String author;
    private int year;
    private double rating; //IMDb

    public Movie(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public int getYear() {
        return year;
    }
    public double getRating() {
        return rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String toString() {
        return "Filmul: " + "\n" +
                "[Nume: " + this.name + "\n" +
                "Autor: " + this.author + "\n" +
                "Anul: " + this.year + "]";
    }
}