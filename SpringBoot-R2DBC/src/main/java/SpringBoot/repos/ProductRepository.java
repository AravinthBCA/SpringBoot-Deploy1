package SpringBoot.repos;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import SpringBoot.entities.Product;

@Repository
public interface ProductRepository extends ReactiveCrudRepository<Product, Integer>{
}
