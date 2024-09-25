package com.hackbattle.byebyeworld.Repository;

import com.hackbattle.byebyeworld.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,Long> {
    Users findByEmail(String email);
}
