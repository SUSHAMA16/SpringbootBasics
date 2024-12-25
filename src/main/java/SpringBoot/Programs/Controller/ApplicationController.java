package SpringBoot.Programs.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {
	
	public ResponseEntity<String>FirstAPI(){
		return ResponseEntity.ok("Hello world");
	}
	
	@GetMapping("secondapi")
	public ResponseEntity<String>SecondAPI(){
		return ResponseEntity.ok("Sushama Kangude");
	}

	@GetMapping("thirdapi")
	public ResponseEntity<String>ThirdAPI(){
		return ResponseEntity.ok("Springboot Basics");
	}
}
