package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;

@RestController // Sen bir controllersın demektir.
@RequestMapping("/api/products") // Birden fazla kontroler olabilceği icin burası kullanılır.
public class ProductsController {

	private ProductService productService;

	@Autowired
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/getAll")
	public DataResult<List<Product>> getAll() {

		return this.productService.getAll();
	}

	@PostMapping("/add")
	public Result add(@RequestBody Product product) {
		return this.productService.add(product);
	}

	@GetMapping("/getByProductName")
	public DataResult<Product> getByProductName(@RequestParam String productName) {

		return this.productService.getByProductName(productName);
	}

	@GetMapping("/getByProductNameAndCategory")
	public DataResult<Product> getByProductNameAndCategory(@RequestParam("productName") String productName,
			@RequestParam("categoryId") int categoryId) {

		return this.productService.getByProductNameAndCategory_CategoryId(productName, categoryId);
	}

	@GetMapping("/getByProductNameOrCategory")
	public DataResult<List<Product>> getByProductNameOrCategory(@RequestParam("productName") String productName,
			@RequestParam("categoryId") int categoryId) {

		return this.productService.getByProductNameOrCategory_CategoryId(productName, categoryId);
	}

	@GetMapping("/getByProductNameContains")
	public DataResult<List<Product>> getByProductNameContains(@RequestParam String productName){
		
		return this.productService.getByProductNameContains(productName);
	}

	@GetMapping("getAllByPage")
	public DataResult<List<Product>> getAll(int pageNo, int pageSize){
		
		return this.productService.getAll(pageNo, pageSize);
	}
	
	@GetMapping("Desc")
	public DataResult<List<Product>> getAllSorted(){
		return this.productService.getAllSorted();
	}
}
