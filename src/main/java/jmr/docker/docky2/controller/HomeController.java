package jmr.docker.docky2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController
{
	@Value("${HomeController.message}")
	private String message;
	
	@RequestMapping( "/" )
	public String home()
	{
		return "hello docky 2: " + message;
	}
}
