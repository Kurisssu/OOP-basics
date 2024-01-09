public class MainClass {
    public static void main(String[] args) {
        System.out.println("__________________________________");
        Movie movie1 = new Movie("Oppenheimer", "Christopher Nolan", 2023);
        System.out.println(movie1);
        movie1.setRating(8.5);
        System.out.println("Ratingul IMDb: " + movie1.getRating());
        System.out.println("__________________________________");
        Car car1 = new Car("Toyota", "Corolla Levin Sprinter Trueno AE86", 1983);
        System.out.println(car1);
        car1.setMotorCapacity(1.6);
        System.out.println("Capacitatea motorului: " + car1.getMotorCapacity() + " litri");
        System.out.println("__________________________________");
        Laptop laptop1 = new Laptop("Asus", "TUF A15", 2022);
        System.out.println(laptop1);
        laptop1.setPrice(15999);
        System.out.println("Pretul: " + laptop1.getPrice() + " Lei Moldovenesti");
        System.out.println("__________________________________");
        Telefon telefon1 = new Telefon("Apple", "iPhone 12 Pro Max", 2021);
        System.out.println(telefon1);
        telefon1.setSystemOperation("iOS");
        System.out.println("Sistema de operare: " + telefon1.getSystemOperation());
        System.out.println("__________________________________");
    }
}