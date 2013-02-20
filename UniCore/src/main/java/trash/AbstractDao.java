package trash;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uni.core.mapper.IMapper;

public abstract class AbstractDao<J, B> {
	
	protected EntityManager em;
	
	protected abstract IMapper<J, B> getMapper();
	
	protected abstract JpaRepository<J, Long> getRepository();
	
	public void save(B businessObject) {
		getRepository().saveAndFlush(getMapper().mapFromBo(businessObject));
	}

}
