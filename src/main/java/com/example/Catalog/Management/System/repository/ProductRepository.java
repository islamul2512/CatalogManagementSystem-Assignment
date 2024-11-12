package com.example.Catalog.Management.System.repository;

import com.example.Catalog.Management.System.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    List<Product> findByNameContainingIgnoreCase(String name);     // Search by name (partial match)

    List<Product> findByBrandIgnoreCase(String brand);             // Filter by brand

    List<Product> findByCategoryIgnoreCase(String category);       // Filter by category

    List<Product> findByPriceBetween(Double minPrice, Double maxPrice);
}
