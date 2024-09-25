package com.hackbattle.byebyeworld.Repository;

import com.hackbattle.byebyeworld.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
