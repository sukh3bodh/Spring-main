// package com.example.mdbspringboot.functions;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;

// import com.example.mdbspringboot.model.Products;
// import com.example.mdbspringboot.repository.ProductsRepository;

// public class ProductsFunctions {
//     @Autowired
// 	ProductsRepository productsRepo;

//     public List<Products> allItems(){
//         List<Products> items = productsRepo.findAll();
//         return items;
//     }

//     public void printItem(Products item){
//         System.out.println("Item Id: " + item.getProductId());
//         System.out.println("Item Name: " + item.getName());
//         System.out.println("Item Description: " + item.getDesc());
//     }

// }
