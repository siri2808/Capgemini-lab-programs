package com.capg.demo.productdb.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.capg.demo.productdb.exception.ProductAlreadyExistsException;
import com.capg.demo.productdb.exception.ProductDoesnotExistException;
import com.capg.demo.productdb.model.Product;
import com.capg.demo.productdb.service.ProductService;
@RestController
public class ProductController {
	@Autowired
	ProductService service;
	@PostMapping("/addproduct")
	public Product addProduct(@RequestBody Product product) throws ProductAlreadyExistsException
	{
		return service.addProduct(product);
	}
	@GetMapping("/getProduct/{id}")
	public Product getProduct(@PathVariable int id) throws ProductDoesnotExistException
	{
		return service.getProduct(id);
	}
	@GetMapping("/Allproducts")
	public List<Product> getAllProduct()
	{
		return service.getAllProduct();
	}
	@DeleteMapping("/deleteProduct/{id}")
	public boolean deleteProduct(@PathVariable int id)
	{
		return service.deleteProduct(id);
	}
	@PutMapping("/updateProduct")
	public Product updateProduct(@RequestBody Product product) throws ProductDoesnotExistException
	{
		return service.updateProduct(product);
	}
}
