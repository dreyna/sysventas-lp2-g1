package pe.edu.upeu.sysventaslp2g1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.upeu.sysventaslp2g1.dao.RolDao;
import pe.edu.upeu.sysventaslp2g1.entity.Rol;

@SpringBootTest
class SysventasLp2G1ApplicationTests {
@Autowired 
private RolDao rolDao;
	@Test
	void contextLoads() {
		Rol r = new Rol();
		r.setIdrol(3);
		r.setNomrol("GV");
		/*
		r.setNomrol("Henry");*/
		//System.out.println(rolDao.create(r));
	System.out.println(rolDao.update(r));
	}

}
