package com.atish.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "Swagger2RestController",description = "This is related to the RestApi Messages")
public class WishRestController {
	
	@GetMapping("/wish/{name}")
	@ApiOperation(value = "Get welcome message from the user",response = String.class
	,tags = "getWelcome Note")
	public String showMsg(@PathVariable ("name") String name) {
		return name+"    "+"Welcome to JavaHero Channel";
	}

}
