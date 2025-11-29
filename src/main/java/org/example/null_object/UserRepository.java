package org.example.null_object;

public class UserRepository {
    public User findUserById(int id){
        if(id == 1){
            return new RealUser("John Doe");
        }
        return new NullUser();
    }
}
