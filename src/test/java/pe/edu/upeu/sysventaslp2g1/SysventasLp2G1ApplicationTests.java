package pe.edu.upeu.sysventaslp2g1;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.upeu.sysventaslp2g1.dao.RolDao;
import pe.edu.upeu.sysventaslp2g1.dao.UsuarioDao;



@SpringBootTest
class SysventasLp2G1ApplicationTests {
@Autowired
private UsuarioDao usuarioDao;
	@Test
	void contextLoads() {
		//Rol r = new Rol();

		/*
		r.setNomrol("Henry");
		//System.out.println(rolDao.create(r));
		Date date = new Date();
		SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
		String stringDate= DateFor.format(date);
		Ventas venta = new Ventas();
		//venta.setIdventas(2);
		venta.setFecha("2020-09-29");
		venta.setTipodoc("Factura");
		venta.setNumdoc("301");
		venta.setIdpersona(3);
		venta.setIdcliente(5);*/
		System.out.println(usuarioDao.read("dreyna").getNomuser());
		
	}

}
