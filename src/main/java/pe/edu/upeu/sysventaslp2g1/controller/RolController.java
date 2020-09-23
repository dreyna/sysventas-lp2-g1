package pe.edu.upeu.sysventaslp2g1.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.sysventaslp2g1.entity.Rol;
import pe.edu.upeu.sysventaslp2g1.service.RolService;

@RestController
@RequestMapping("/roles")
public class RolController {
@Autowired
private RolService rolService;
@GetMapping("/lista")
public List<Map<String, Object>> lista(){
	return rolService.readAll();
}
@GetMapping("/{id}")
public Rol read(@PathVariable int id ) {
	return rolService.read(id);
}
@DeleteMapping("/delete/{id}")
public int delete(@PathVariable int id ) {
	return rolService.delete(id);
}
@PostMapping("/rol")
public int create(@RequestBody Rol r) {
	System.out.println("Dato"+r.getNomrol());
	return rolService.create(r);
}
}
