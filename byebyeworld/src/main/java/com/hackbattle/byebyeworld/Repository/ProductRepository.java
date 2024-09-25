package com.hackbattle.byebyeworld.Repository;

import com.hackbattle.byebyeworld.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
