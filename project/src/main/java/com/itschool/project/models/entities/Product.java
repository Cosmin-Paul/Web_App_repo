package com.itschool.project.models.entities;

import jakarta.persistence.*;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "products")

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @JoinColumn(name = "product_name")
    private String productName;
    @ManyToMany(mappedBy = "favorite_products")
    private List<User> usersWithFavorites = new ArrayList<>();
}