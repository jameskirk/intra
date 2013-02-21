package com.uni.dao.impl;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.uni.dao.PersonDao;
import com.uni.dao.ThingKind;
import com.uni.dao.util.JpaHelper;
import com.uni.dao.util.UniJpaRepository;
import com.uni.jpa.base.Department;
import com.uni.jpa.base.Student;
import com.uni.jpa.base.UniGroup;

@Repository
@Transactional
public class PersonDaoImpl implements PersonDao {
	
	@Autowired
	private EntityManager em;

	@Override
	public <T> void addSomething(T source, ThingKind thingKind) {
		switch (thingKind) {
		case UNI_GROUP:
			UniGroup uniGroup = (UniGroup) source;
			UniJpaRepository<UniGroup, Integer> uniRepo = new UniJpaRepository<UniGroup, Integer>(UniGroup.class, em);
			UniJpaRepository<Department, Integer> depRepo = new UniJpaRepository<Department, Integer>(Department.class, em);
			UniGroup uniGroupSaved = uniRepo.saveAndFlush(uniGroup);
			System.out.println(uniGroupSaved.getId());
			break;
		case STUDENT:
			Student student = (Student) source;
			JpaHelper.getInstance().getRepo(Student.class).saveAndFlush(student);
		default:
			break;
		}
		
	}
	
	public <T> void addSomething1(T source, Class<T> type) {
			new GenericPersonDao().addSomething(source, type);
	}
	
	@Override
	public <T> T getSomething(int id, ThingKind thingKind, Class<T> t) {
		switch (thingKind) {
		case UNI_GROUP:
			UniJpaRepository<UniGroup, Integer> uniRepo = new UniJpaRepository<UniGroup, Integer>(UniGroup.class, em);
			UniGroup uniGroup = uniRepo.findOne(id);
			System.out.println(uniGroup.getId());
			return (T) uniGroup;
		default:
			break;
		}
		return null;
	}

	@Override
	public void deleteSomething(int id, ThingKind thingKind) {
		switch (thingKind) {
		case UNI_GROUP:
			UniJpaRepository<UniGroup, Integer> uniRepo = new UniJpaRepository<UniGroup, Integer>(UniGroup.class, em);
			uniRepo.delete(id);
			break;
		default:
			break;
		}
		
	}

	@Override
	public <T> void updateSomething(T source, ThingKind thingKind) {
		// TODO Auto-generated method stub
		
	}


}
