package com.Ecommerce.Ecommerce.Dao;

import ch.qos.logback.core.boolex.EvaluationException;
import com.Ecommerce.Ecommerce.Entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductsRepository extends JpaRepository<Products,Integer> {

    @Query(value = "SELECT * FROM products WHERE category_id =?1 ORDER BY rating DESC", nativeQuery = true)
    List<Products> findByRating(int theId);

    @Query(value = "SELECT * FROM products WHERE category_id =?1 ORDER BY price DESC", nativeQuery = true)
    List<Products> findByPricing(int theId);
}
