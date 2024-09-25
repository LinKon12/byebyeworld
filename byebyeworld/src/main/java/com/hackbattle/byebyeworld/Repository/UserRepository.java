package com.hackbattle.byebyeworld.Repository;

import com.hackbattle.byebyeworld.Entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<AppUser,Long> {
}
