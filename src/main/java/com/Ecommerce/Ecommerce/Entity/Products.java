package com.Ecommerce.Ecommerce.Entity;

import javax.persistence.*;

@Entity
@Table(name="products")
public class Products {

        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        @Column(name="product_id")
        private int product_Id;

        @Column(name="product_name")
        private String product_Name;

        @Column(name="price")
        private int price;

        @Column(name="rating")
        private double rating;


    @ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
        @JoinColumn(name="category_id")
        private Categories categories;

        public Products() {

        }

        public Products(String productName, int price, double rating) {
            this.product_Name = productName;
            this.price = price;
            this.rating = rating;
        }

    public int getId() {
        return product_Id;
    }

    public void setId(int id) {
        this.product_Id = id;
    }

    public String getProductName() {
        return product_Name;
    }

    public void setProductName(String productName) {
        this.product_Name = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Categories getCategories() {
        return categories;
    }

    @Override
    public String toString() {
        return "Products{" +
                "productName='" + product_Name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                ", categories=" + categories +
                '}';
    }
}
