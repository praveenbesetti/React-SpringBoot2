package com.example.demo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Users.Users;

public interface UserRepository extends JpaRepository<Users,Long> {

}
