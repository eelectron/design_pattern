package org.example.flyweight;

public class Client {
    static void main() {
        CarModel car1 = CarModelFactory.getCarModel("Tata Nexon", "Electric", "White");
        car1.show("KA50MY4898", "Prashant Singh");

        CarModel car2 = CarModelFactory.getCarModel("Tata Nexon", "Electric", "White");
        car2.show("XYZ789", "Jane Smith");

        CarModel car3 = CarModelFactory.getCarModel("Honda", "I4", "Blue");
        car3.show("LMN456", "Alice Johnson");

        System.out.println("car1 and car2 are the same instance: " + (car1 == car2));
        System.out.println("car1 and car3 are the same instance: " + (car1 == car3));
    }
}
