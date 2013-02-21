package uni.test.dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.uni.dao.UniDao;
import com.uni.dao.etc.DaoException;
import com.uni.dao.repo.UniQuery;
import com.uni.jpa.base.Department;
import com.uni.jpa.base.UniGroup;

public class TestUserDao {
	
	public static ApplicationContext context = 
			new ClassPathXmlApplicationContext("applicationContext-dao.xml");
	
	public static void main(String[] args) {
		//save();
		load();
	}
	
	private static void save() {
		UniDao dao = (UniDao) context.getBean("uniDaoImpl");
		UniGroup u = new UniGroup();
		Department d = new Department();
		u.setDepartment(d);
		d.setName("dep11");
		u.setName("gr11");
		try {
			dao.addSomething(u, UniGroup.class);
		} catch (DaoException e) {
			e.printStackTrace();
		}
	}
	
	private static void load() {
		try {
			UniDao dao = (UniDao) context.getBean("uniDaoImpl");
			UniGroup u = dao.getSomething(7, UniGroup.class);
			System.out.println(u.getId()+ "  "+ u.getDepartment().getId());
			List<UniGroup>  groups = dao.searchSomething(UniGroup.class, UniQuery.FIND_GROUPS_BY_FACULTY);
			for (UniGroup g:groups) {
				System.out.println(g.getId());
			}
		} catch (DaoException e) {
			e.printStackTrace();
		}
	}

}
