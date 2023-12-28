package com.examplerest.demorest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@SpringBootApplication
@RestController
public class DemoRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoRestApplication.class, args);

	}


}
@RestController
@RequestMapping("/coffees")
class RestApiDemoController{
	List<Coffee> coffees = new ArrayList<>();
public RestApiDemoController() {
coffees.addAll(List.of(
		new Coffee("LoveAzza"),
		new Coffee("Nescaffe"),
		new Coffee("NotCoffee") ,
		new Coffee("MyLittleCoffee")
));
}
@RequestMapping (value = "/coffee", method = RequestMethod.GET)
	Iterable <Coffee> getCoffees(){
	return  coffees;
}
@GetMapping
	Iterable<Coffee> getCoffee2(){
return  coffees;
}
@GetMapping("/{id}")
	Optional<Coffee> getCoffeeById(@PathVariable String id){
	for(var c : coffees){
		if(c.getId().equals(id)){
			return  Optional.of(c);
		}
	}
	return  Optional.empty();
}
@PostMapping
	Coffee postCoffee (@RequestBody Coffee coffee){
	coffees.add(coffee);
	return  coffee;
}
@PutMapping ("/id")
	ResponseEntity <Coffee> putCoffee (@PathVariable String id , @RequestBody Coffee coffee ){
	int coffeeIndex = -1;
	for(var c : coffees){
		if(c.getId().equals(id)){
			coffeeIndex = coffees.indexOf(c);
			coffees.set(coffeeIndex,coffee);
		}
	}
	return  (coffeeIndex == -1)?
			new ResponseEntity<>(postCoffee(coffee), HttpStatus.CREATED):
			new ResponseEntity<>(coffee, HttpStatus.OK);

}


@PutMapping ("/{id}")
	Coffee putCoffees(@PathVariable String id , @RequestBody Coffee coffee){
	int coffeeIndex = -1;
	for( var c : coffees){
		if(c.getId().equals(id)){
			coffeeIndex = coffees.indexOf(c);
			coffees.set(coffeeIndex, coffee);
		}
	}
	return  coffeeIndex== -1 ? postCoffee(coffee) : coffee;
}
@DeleteMapping ("/{id}")
	void removeCoffee (@PathVariable String id){
	coffees.removeIf((c)-> c.getId().equals(id));
}


}
@RestController
@RequestMapping("/coffeeList")
class  RestApiDemoController2{
	List<Coffee> coffeeList =  new ArrayList<>();
	public RestApiDemoController2(){
		coffeeList.addAll(List.of(
				new Coffee("Jacobbs"), new Coffee("Little Pony"),
				new Coffee ("Candy Arlen"), new Coffee ("Alina")
		));
	}
	@GetMapping
	Iterable<Coffee> getCoffeeList(){
		return  coffeeList;
	}
	@GetMapping("/getCoffeeNameById/{id}")
	Optional<String> getCoffeeNameById(@PathVariable String id){
		for (var c : coffeeList){
			if(c.getId().equals(id)){
				return  Optional.of(c.getName());
			}
		}
		return  Optional.empty();
	}

	@PostMapping("/coffeeList")
	Coffee postCoffee (@RequestBody Coffee coffee){
		coffeeList.add(coffee);
		return  coffee;
	}
	@PutMapping("/coffeeList/{id}")
	Coffee putCoffee(@PathVariable String id , @RequestBody Coffee coffee ){
		int IndexOf = -1;
		for( var c : coffeeList){
			if(c.getId().equals(id)){
				IndexOf = coffeeList.indexOf(c);
				coffeeList.set(IndexOf, coffee);
			}
		}
		return  IndexOf == -1 ? postCoffee(coffee) : coffee;
	}
	@DeleteMapping ("/coffeeList/remove/{id}")
	void deleteCoffee (@PathVariable String id){
		coffeeList.removeIf(c-> c.getId().equals(id));
	}
}

class Coffee{
	private  final String id;
	private String name;

	public  Coffee(String id, String name){
		this.id = id;
		this.name = name;
	}
	public  Coffee( String name){
		this(UUID.randomUUID().toString(), name);
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
