package uz.apps.productservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Developed by Jaxongir Abdusalomov
 * Mail: abdusalomov0425@gmail.com
 * Date : 26.07.2022, 17:35
 * Project Name : product-service
 */

@RefreshScope
@RestController
@RequestMapping("/api/test")
public class TestController {

    @Value("${test.name}")
    private String name;

    @GetMapping
    public String test() {
        return name;
    }

}
