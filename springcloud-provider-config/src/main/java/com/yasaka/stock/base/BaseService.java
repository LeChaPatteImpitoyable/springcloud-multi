package com.yasaka.stock.base;

import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.lang.reflect.ParameterizedType;
import java.util.List;

@Transactional
@Service
public abstract class BaseService<T> implements ServiceInterface<T>{
	
	//反射对象  
	private Class<T> clazz;
	
	//实体管理器引用  
	
	protected abstract EntityManager getEntityManager();
	
	protected abstract DAOInterface<T> getDAOInterface();
	
	/**
	 * 构造函数反射泛型对象真实类型
	 */
	@SuppressWarnings("unchecked")
	public BaseService() {
		// 获取当前new的对象的泛型父类
		ParameterizedType pType = (ParameterizedType) this.getClass().getGenericSuperclass();
		// 获取类型参数的真是值，就是泛型参数的个数；
		this.clazz = (Class<T>) pType.getActualTypeArguments()[0];
	}

	@Override
	public T find(String id) throws Exception {
		   return getEntityManager().find(clazz, id);
	}

	@Override
	public T save(T t) throws Exception {
//		getEntityManager().persist(t);
		T save = getDAOInterface().save(t);
		return save;
	}

	@Override
	public void update(T t) throws Exception {
		getEntityManager().merge(t);
		
	}

	@Override
	public void del(String id) throws Exception {
		T t =getEntityManager().find(clazz, id);
		if(t!=null){
			getEntityManager().remove(t);
		}
	}

	@Override
	public List<T> findAll() throws Exception {
		return getDAOInterface().findAll();
	}

	
}
