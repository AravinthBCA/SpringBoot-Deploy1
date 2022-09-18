package SpringBoot.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table(name="product")
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	@Id
	private Integer id;
	private String brand;
	private String model;
	private String description;
	private Double price;
}
