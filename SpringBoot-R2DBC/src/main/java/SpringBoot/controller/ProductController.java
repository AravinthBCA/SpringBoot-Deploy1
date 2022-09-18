package SpringBoot.controller;

import java.time.Duration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import SpringBoot.entities.Product;
import SpringBoot.repos.ProductRepository;
import reactor.core.publisher.Flux;

@RestController
public class ProductController {

	@Autowired
	private ProductRepository productRepoReactive;
	
	@GetMapping("/")
	public String initial() {
		return "welcome";
	}
	
	@GetMapping(value = "/productsR", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public Flux<Product> getAllProductsReactive(){
		return productRepoReactive.findAll()
								.delayElements(Duration.ofSeconds(1))
								.log();
	}
	
	@GetMapping(value = "/products")
	public Flux<Product> getAllProducts() throws InterruptedException{
		Thread.sleep(3);
		return productRepoReactive.findAll();
	}
	
}
