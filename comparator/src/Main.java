import java.util.*;

public class Main {
    public static void main(String[] args) {
        //below is how to sort using comparator
        //you can also make an object comparable by implementing comparable
        //comparable dont need comparator, just call collections.sort(the list)
        List<City> cities = new ArrayList<>();
        cities.add(new City(500, "Nagoya"));
        cities.add(new City(1500, "Hiroshima"));
        cities.add(new City(1000, "Sendai"));
        cities.add(new City(3000, "Jakarta"));
        //make comparator object
        Comparator<City> largestPop = new Comparator<City>() {
            @Override
            public int compare(City o1, City o2) {
                if (o1.pop > o2.pop) {
                    return -1;
                } else if (o1.pop < o2.pop) {
                    return 1;
                }
                return 0;
            }
        };
        //sort here
        cities.sort(largestPop);

        for (City cit : cities) {
            System.out.println(cit.name);
        }
    }
}
