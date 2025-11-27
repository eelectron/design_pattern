package org.example.builder;

import java.time.LocalDate;

public class Client {
    static void main() {
        User user = new User.Builder().name("Prashant")
                .age(36)
                .address("B201 Sashank Florento")
                .phone("+917676798841")
                .email("prashantexploring@gmail.com")
                .isActive(true)
                .createdAt(LocalDate.now())
                .build();
        System.out.println(user);
    }
}
