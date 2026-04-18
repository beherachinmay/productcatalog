package com.ecom.productcatalog.config;

import com.ecom.productcatalog.model.Category;
import com.ecom.productcatalog.model.Product;
import com.ecom.productcatalog.repository.CategoryRepository;
import com.ecom.productcatalog.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


import java.util.Arrays;

@Component
public class DataSeeder implements CommandLineRunner {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public DataSeeder(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Clear all exiting data
        productRepository.deleteAll();
        categoryRepository.deleteAll();

        // Create Categories
        Category electronics = new Category();
        electronics.setName("Electronics");

        Category clothing = new Category();
        clothing.setName("Clothing");

        Category home = new Category();
        home.setName("Home and Kitchen");

        Category foods = new Category();
        foods.setName("Foods");

        categoryRepository.saveAll(Arrays.asList(electronics, home, clothing, foods));

        // Create Products
        Product phone = new Product();
        phone.setName("SmartPhone");
        phone.setDescription("Latest model smartphone with amazing features");
        phone.setImageUrl("https://placehold.co/400x400");
        phone.setPrice(699.99);
        phone.setCategory(electronics);


        Product laptop = new Product();
        laptop.setName("Laptop");
        laptop.setDescription("High-performance laptop for work and play.");
        laptop.setImageUrl("https://placehold.co/400x400");
        laptop.setPrice(999.99);
        laptop.setCategory(electronics);

        Product jacket = new Product();
        jacket.setName("Winter Jacket");
        jacket.setDescription("Warm and cozy jacket for winter.");
        jacket.setImageUrl("https://placehold.co/400x400");
        jacket.setPrice(129.99);
        jacket.setCategory(clothing);

        Product pant = new Product();
        pant.setName("full pant");
        pant.setDescription("Full Trouser");
        pant.setImageUrl("https://placehold.co/400x400");
        pant.setPrice(99.99);
        pant.setCategory(clothing);

        Product blander = new Product();
        blander.setName("Blender");
        blander.setDescription("High-speed blender for smoothies and more.");
        blander.setImageUrl("https://placehold.co/400x400");
        blander.setPrice(89.99);
        blander.setCategory(home);

        Product Induction = new Product();
        Induction.setName("Induction");
        Induction.setDescription(" 1800 W Induction Cooktop Push Button (Black, Favourite)");
        Induction.setImageUrl("https://placehold.co/400x400");
        Induction.setPrice(699.99);
        Induction.setCategory(home);

        Product Grocery = new Product();
        Grocery.setName("Grocery");
        Grocery.setDescription("All Item Grocery is here ");
        Grocery.setImageUrl("https://placehold.co/400x400");
        Grocery.setPrice(58.99);
        Grocery.setCategory(foods);


        Product Healthcare = new Product();
        Healthcare.setName("Healthcare");
        Healthcare.setDescription("All Types medicine is available or other things ");
        Healthcare.setImageUrl("https://placehold.co/400x400");
        Healthcare.setPrice(79.99);
        Healthcare.setCategory(foods);

        productRepository.saveAll(Arrays.asList(phone, laptop, jacket, pant, blander, Induction, Grocery, Healthcare));

    }

}