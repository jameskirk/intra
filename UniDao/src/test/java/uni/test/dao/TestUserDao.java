package uni.test.dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.uni.dao.PersonDao;
import com.uni.dao.ThingKind;
import com.uni.dao1.IUserDao;
import com.uni.jpa.base.Department;
import com.uni.jpa.base.UniGroup;
import com.uni.jpa.base.User;

public class TestUserDao {
	
	public static ApplicationContext context = 
			new ClassPathXmlApplicationContext("applicationContext-dao.xml");
	
	public static void main(String[] args) {
		save();
		load();
	}
	
	private static void save() {
		PersonDao dao = (PersonDao) context.getBean("personDaoImpl");
		UniGroup u = new UniGroup();
		Department d = new Department();
		u.setDepartment(d);
		d.setName("dep1");
		u.setName("gr1");
//		dao.addSomething(u, ThingKind.UNI_GROUP);
		dao.addSomething1(u, UniGroup.class);
	}
	
	private static void load() {
		PersonDao dao = (PersonDao) context.getBean("personDaoImpl");
		UniGroup u = dao.getSomething(7, UniGroup.class);
		System.out.println(u.getId()+ "  "+ u.getDepartment().getId());
	}
	
	private static void save1() {
		IUserDao userDao = (IUserDao) context.getBean("userDao");
		User user = new User();
		user.setName("Bob");
		userDao.saveAndFlush(user);
	}
	
	private static void load1() {
		IUserDao userDao = (IUserDao) context.getBean("userDao");
		List<User> users = userDao.findAll();
		for (User u: users) {
			System.out.println(u.getId() + " : " + u.getName());
		}
	}

}
