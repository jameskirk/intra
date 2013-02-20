package com.uni.core.mapper;

public interface IMapper<J, B> {
	
	public B mapIntoBo(J jpaObject);
	
	public J mapFromBo(B businessObject);

}
