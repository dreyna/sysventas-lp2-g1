package pe.edu.upeu.sysventaslp2g1.service;

import pe.edu.upeu.sysventaslp2g1.entity.Ventas;

public interface VentaService {
   int create(Ventas v);
   int update(Ventas v);
   Ventas read(int id);
}
