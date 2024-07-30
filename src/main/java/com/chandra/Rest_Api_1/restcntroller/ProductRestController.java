package com.chandra.Rest_Api_1.restcntroller;

import com.chandra.Rest_Api_1.binding.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProductRestController {

@GetMapping("/product")
    public Product getProduct(@RequestParam ("pid") Integer pid){  // sending the data to the url using reqparam
        Product p=new Product(pid,"Chandra",124.22);//http://localhost:8080/product?pid=1000

      return p;
    }
    @GetMapping("/products")
    public List<Product> getAllProducts(){
    Product p=new Product(101,"hsdhjs",250.33);
        Product p1=new Product(101,"hsdhjs",250.33);
        Product p2=new Product(101,"hsdhjs",250.33);
        Product p3=new Product(101,"hsdhjs",250.33);
        Product p4=new Product(101,"hsdhjs",250.33);
        Product p5=new Product(101,"hsdhjs",250.33);

       List<Product> products= Arrays.asList(p,p1,p2,p3,p4,p5);

       return products;
    }

}
