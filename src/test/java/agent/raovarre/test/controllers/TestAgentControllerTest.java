package agent.raovarre.test.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test-agent")
public class TestAgentControllerTest {

	@GetMapping("/create")
	public String create() {
		return "Test Agent Created Successfully";
	}
	
}
