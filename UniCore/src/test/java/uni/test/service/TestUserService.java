package uni.test.service;

import junit.framework.Assert;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.uni.core.dto.security.RegistraionDTO;
import com.uni.core.dto.security.UserAccountDTO;
import com.uni.core.exception.UniError;
import com.uni.core.exception.UniException;
import com.uni.core.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class TestUserService {
	
	@Autowired
	private IUserService service;
	
	@Test
	public void createUserAccountSuccess() throws UniException {
		UserAccountDTO userAccount = new UserAccountDTO();
		userAccount.setLogin("test_WWWW1"+ System.currentTimeMillis());
		RegistraionDTO registraion = new RegistraionDTO();
		registraion.setUserAccount(userAccount);
		service.createUserAccount(registraion);
	}
	
	@Ignore
	@Test
	public void createUserAccountFailure() {
		UniError error = null;
		UserAccountDTO userAccount = new UserAccountDTO();
		userAccount.setLogin("bob");
		RegistraionDTO registraion = new RegistraionDTO();
		registraion.setUserAccount(userAccount);
		try {
			service.createUserAccount(registraion);
		} catch (UniException e) {
			error = e.getError();
		}
		Assert.assertEquals(UniError.EU001, error);
	}
	

}
