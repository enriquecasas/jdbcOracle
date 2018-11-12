package pe.edu.upeu.jdbc.test;

import java.util.List;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.edu.upeu.jdbc.dao.RolDao;
import pe.edu.upeu.jdbc.dao.UsuarioDao;
import pe.edu.upeu.jdbc.entity.Rol;
import pe.edu.upeu.jdbc.entity.Usuario;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		//System.out.println(context);
		UsuarioDao dao = (UsuarioDao)context.getBean("usuarioDaoImp");
		
		/*
		System.out.println(dao.update(new Rol(13, "camote"))); */ 
		try {
			System.out.println("asdfgjk");
			List<Map<String, Object>> lista = dao.validarUser(new Usuario("enrique", "123"));
            for(Map<String,Object> map:lista) {
           	 System.out.println(map.get("idrol")+"/"+map.get("nom_rol"));
            } 
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Kike:"+e);
		}
             
       // Rol rr = dao.read(14);
       // System.out.println("Error: "+rr.getNomrol());
      //  dao.delete(3);
        context.close();
	}

}
