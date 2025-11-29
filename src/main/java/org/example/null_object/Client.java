package org.example.null_object;

public class Client {
    static void main() {
        UserRepository userRepository = new UserRepository();
        User user1 = userRepository.findUserById(1);
        user1.printName(); // Output: User Name: John Doe
        User user2 = userRepository.findUserById(2);
        user2.printName(); // Output: No User Available
    }
}
