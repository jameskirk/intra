package trash;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import com.uni.core.mapper.IMapper;
import com.uni.core.mapper.UserMapper;
import com.uni.jpa.base.User;

public class UserDao1 extends AbstractDao<User, User> {
	
	@Override
	protected IMapper<User, User> getMapper() {
		return new UserMapper();
	}

	@Override
	protected JpaRepository<User, Long> getRepository() {
		return new SimpleJpaRepository<User, Long>(User.class, em);
	}
}
