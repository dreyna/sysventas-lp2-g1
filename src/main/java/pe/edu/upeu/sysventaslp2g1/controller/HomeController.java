package pe.edu.upeu.sysventaslp2g1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/")
	public String mensaje() {
		return "Bienvenidos a Microservicios Síncronos";
	}
	@GetMapping("/hola")
	public String mensaje2() {
		return "Bienvenidos a Microservicios Síncronos";
	}
	@GetMapping("/hola2")
	public String mensaje3() {
		return "Bienvenidos a Microservicios Síncronos";
	}
	@GetMapping("/hola1")
	public String mensaje4() {
		return "Bienvenidos a Microservicios Síncronos";
	}

}
