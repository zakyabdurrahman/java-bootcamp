import jakarta.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    //if auto increment, strategy should be identity
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id")
    private int carId;
    @Column(name = "car_name")
    private String carName;
    @Column(name = "car_year")
    private int carYear;
    @Column(name = "price")
    private float carPrice;

    public Car(String carName, int carYear, float carPrice) {
        this.carName = carName;
        this.carYear = carYear;
        this.carPrice = carPrice;
    }

    public Car() {

    }

    public int getCarId() {
        return carId;
    }

    public Car setCarId(int carId) {
        this.carId = carId;
        return this;
    }

    public String getCarName() {
        return carName;
    }

    public Car setCarName(String carName) {
        this.carName = carName;
        return this;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }

    public float getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(float carPrice) {
        this.carPrice = carPrice;
    }




}
