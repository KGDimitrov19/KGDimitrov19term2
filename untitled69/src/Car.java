public class Car implements Comparable<Car> {
    private String brand;
    private String model;
    private int age;

    public Car(String brand, String model, int age) {
        this.brand = brand;
        this.model = model;
        this.age = age;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Car other) {

        return this.brand.compareTo(other.getBrand());
//        if (this.brand.compareTo(other.getBrand()) < 0) {
//            return -1;
//        }
//        else if(this.brand.compareTo(other.getBrand())>0)
//        {
//            return 1;
//        }
//        else{
//            return 0;
//        }

    }
}
