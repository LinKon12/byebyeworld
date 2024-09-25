package com.hackbattle.byebyeworld.Repository;

import com.hackbattle.byebyeworld.Entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Products,Long> {
    List<Products> findByUserId(Long userId);
}
