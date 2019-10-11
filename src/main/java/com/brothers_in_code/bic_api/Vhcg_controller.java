package com.brothers_in_code.bic_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Vhcg_controller {
	@GetMapping("/vhcg")
	@ResponseBody
	public Integer multiplication(@RequestParam(required = true) Integer number) {
		return number*number;
	}
}
	

