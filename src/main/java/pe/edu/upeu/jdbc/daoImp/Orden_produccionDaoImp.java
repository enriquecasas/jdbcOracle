package pe.edu.upeu.jdbc.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.jdbc.dao.Orden_produccionDao;
import pe.edu.upeu.jdbc.entity.Orden_produccion;

@Repository
public class Orden_produccionDaoImp implements Orden_produccionDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int create(Orden_produccion r) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Orden_produccion r) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Orden_produccion read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAllop() {
		// TODO Auto-generated method stub

		return jdbcTemplate.queryForList("Select * from orden_produccion");
	}

}
