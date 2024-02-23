package bg.smg.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/tickets")
	public String index() {
		return "Here will be all the tickets...";
	}

}
