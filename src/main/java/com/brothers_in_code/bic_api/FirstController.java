package com.brothers_in_code.bic_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
														
@RestController
public class FirstController {
	@GetMapping("/baby")
	@ResponseBody
	public String word(@RequestParam(required = false) String word) {
		if (word == null) {
			return "(TEST #2: I'm William Antonio, I was born NOW, I can't speak yet!)";
		}
		else {
			return "(TEST #2: I'm still a baby, I can't say '" + word + "'!)";
		}
	}
}