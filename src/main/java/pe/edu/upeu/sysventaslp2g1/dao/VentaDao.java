package pe.edu.upeu.sysventaslp2g1.dao;

import pe.edu.upeu.sysventaslp2g1.entity.Ventas;

public interface VentaDao {
int create(Ventas v);
int update(Ventas v);
Ventas read(int id);
}
