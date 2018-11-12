package pe.edu.upeu.jdbc.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.jdbc.entity.Orden_produccion;


public interface Orden_produccionDao {
	int create(Orden_produccion r);
	int update(Orden_produccion r);
	int delete(int id);
	Orden_produccion read(int id);
	List<Map<String, Object>> readAllop();
}
