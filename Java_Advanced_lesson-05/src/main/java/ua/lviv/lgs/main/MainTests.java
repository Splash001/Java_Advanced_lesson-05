package ua.lviv.lgs.main;

import java.sql.Date;

import ua.lviv.lgs.domain.Bucket;
import ua.lviv.lgs.domain.Product;
import ua.lviv.lgs.domain.User;
import ua.lviv.lgs.service.BucketService;
import ua.lviv.lgs.service.ProductService;
import ua.lviv.lgs.service.UserService;
import ua.lviv.lgs.service.impl.BucketServiceImpl;
import ua.lviv.lgs.service.impl.ProductServiceImpl;
import ua.lviv.lgs.service.impl.UserServiceImpl;

public class MainTests {
	public static void main(String[] args) {
		UserService userService = new UserServiceImpl();
		ProductService productService = new ProductServiceImpl();
		BucketService bucketService = new BucketServiceImpl();
		
		userService.create(new User("splash001@rambler.ru", "Henry", "Wallberg", "user"));
		System.out.println(userService.read(1));
		userService.update(new User("splash001@rambler.ru" , "Henry", "Wallberg", "admin"));
		System.out.println(userService.read(1));
//		userService.delete(1);
		System.out.println(userService.readAll());
		
		productService.create(new Product("Fallout", "Postappocalyptic world", 99.50));
		System.out.println(productService.read(1));
		productService.update(new Product(1, "Igromaniya", "Journal about videogames", 55.45));
		System.out.println(productService.read(1));
//		productService.delete(1);
		System.out.println(productService.readAll());
		
		bucketService.create(new Bucket(1, 1, Date.valueOf("2019-12-05")));
		System.out.println(bucketService.read(1));
		bucketService.delete(1);
		System.out.println(bucketService.readAll());
	}

}
