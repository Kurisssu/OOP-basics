public class Laptop {
    private String companyName;
    private String model;
    private int year;
    private int price; //Lei Moldovenesti

    public Laptop(String companyName, String model, int year) {
        this.companyName = companyName;
        this.model = model;
        this.year = year;
    }

    public String getCompanyName() {
        return companyName;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.companyName = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return "Laptop: " + "\n" +
                "[Nume companie: " + this.companyName + "\n" +
                "Model: " + this.model + "\n" +
                "Anul: " + this.year + "]";
    }
}