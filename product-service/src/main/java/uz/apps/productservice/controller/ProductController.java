package uz.apps.productservice.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import uz.apps.productservice.model.Product;
import uz.apps.productservice.repository.ProductRepository;

import java.util.List;

/**
 * Developed by Jaxongir Abdusalomov
 * Date : 26.07.2022
 * Time : 12:41
 * Project Name : product-service
 */

@RestController
@AllArgsConstructor
@RequestMapping("api/product")
public class ProductController {

    private final ProductRepository productRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody Product product) {
        productRepository.save(product);
    }

}
