package com.Ecommerce.Ecommerce.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="categories")
public class Categories {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="categoryId")
    private int id;

    @Column(name="category_name")
    private String categoryName;

    @OneToMany(mappedBy="categories",
            cascade= {CascadeType.PERSIST, CascadeType.MERGE,
                    CascadeType.DETACH, CascadeType.REFRESH})
    private List<Products> productsList;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Categories{" +
                "id=" + id +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

}
