package com.miguelsd.project1spring.repositores;

import com.miguelsd.project1spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
