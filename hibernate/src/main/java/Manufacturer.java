import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "manufacturers")
public class Manufacturer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "man_id")
    private int manId;
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = Car_.MANUFACTURER)
    private List<Car> cars;

    public List<Car> getCars() {
        return this.cars;
    }

    public Manufacturer addCar(Car car) {
        this.cars.add(car);
        return this;
    }

    public int getManId() {
        return manId;
    }

    public String getName() {
        return name;
    }

    public Manufacturer setName(String name) {
        this.name = name;
        return this;
    }
}
