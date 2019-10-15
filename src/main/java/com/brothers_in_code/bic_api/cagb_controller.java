package com.brothers_in_code.bic_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cagb_Controller {
	@GetMapping("/cagb")
	@ResponseBody
	public Integer resta(@RequestParam(required = true) Integer numero) {
		return 10 - numero;
    
 
	}
