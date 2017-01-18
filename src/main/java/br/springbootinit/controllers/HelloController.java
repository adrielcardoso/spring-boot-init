package br.springbootinit.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.springbootinit.config.Controller;

@RestController
public class HelloController extends Controller 
{
	 @RequestMapping(
    		value ="/hello", 
    		method = RequestMethod.GET)
    public String iAmHere()
    {
    	return "Hello Word";
    }
}
