package com.brothers_in_code.bic_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cacg_Controller {
	@GetMapping("/cacg")
	@ResponseBody
	public Integer suma(@RequestParam(required = true) Integer numero) {
		return numero + numero;
	}
}
