package uni.test.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.uni.core.dto.StudentDTO;
import com.uni.core.dto.UniGroupDTO;
import com.uni.core.exception.UniException;
import com.uni.core.service.IUniService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class TestUserService {
	
	@Autowired
	private IUniService service;
	
	@Test
	public void createUserAccountSuccess() {
		try {
			UniGroupDTO u = new UniGroupDTO();
			//u.setName("srv1");
			//service.addSomething(u, UniGroupDTO.class);
			u = service.getSomething(171, UniGroupDTO.class);
			StudentDTO s = service.getSomething(1, StudentDTO.class);
			if (u != null) System.out.println(u.getName());
		} catch (UniException e) {
			System.out.println("FROM TEST");
		}
		
//		UserAccountDTO userAccount = new UserAccountDTO();
//		userAccount.setLogin("test_WWWW1"+ System.currentTimeMillis());
//		RegistraionDTO registraion = new RegistraionDTO();
//		registraion.setUserAccount(userAccount);
//		service.createUserAccount(registraion);
	}
	
//	@Ignore
//	@Test
//	public void createUserAccountFailure() {
//		UniError error = null;
//		UserAccountDTO userAccount = new UserAccountDTO();
//		userAccount.setLogin("bob");
//		RegistraionDTO registraion = new RegistraionDTO();
//		registraion.setUserAccount(userAccount);
//		try {
//			service.createUserAccount(registraion);
//		} catch (UniException e) {
//			error = e.getError();
//		}
//		Assert.assertEquals(UniError.EU001, error);
//	}
	

}
