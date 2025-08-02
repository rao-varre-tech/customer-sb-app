package agent.raovarre.customer.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@GetMapping("/create")
	public String create() {
		return "Customer Created Successfully";
	}
	
}
