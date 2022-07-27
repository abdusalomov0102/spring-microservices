package uz.apps.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.apps.productservice.model.Product;

/**
 * Developed by Jaxongir Abdusalomov
 * Date : 26.07.2022
 * Time : 12:40
 * Project Name : product-service
 */

public interface ProductRepository extends JpaRepository<Product, String> {
}
