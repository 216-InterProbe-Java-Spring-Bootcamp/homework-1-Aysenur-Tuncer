package bootcamphomework1.controller;

import bootcamphomework1.entity.Product;
import bootcamphomework1.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    LocalDate date = LocalDate.now();
    Date nowdate=Date.from(date.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());


    @GetMapping("/findProductById/{id}")
    public Product findProductById(@PathVariable int id) {
        return productRepository.findById(id).orElse(null);
    }


    @GetMapping("/getExpiredProduct")
    public List<Product> getExpiredProduct(){
        return productRepository.getExpiredProduct(nowdate);
    }

    @GetMapping("/getNotExpiredProduct")
    public List<Product> getNotExpiredProduct(){
        return productRepository.getNotExpiredProduct(nowdate);
    }










}
