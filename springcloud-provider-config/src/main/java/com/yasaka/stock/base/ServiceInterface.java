package com.yasaka.stock.base;

import java.util.List;

/**
 * 通用service接口
 * @author zhangy
 *
 * @param <T>
 */
public interface ServiceInterface<T> {

	/**
	 * 添加
	 */
	public T save(T t) throws Exception;
	/**
	 * 修改
	 */
	public void update(T t) throws Exception;

	/**
	 * 删除
	 */
	public void del(String id) throws Exception;

	/**
	 * 查询单个
	 */
	public T find(String id) throws Exception;

	/**
	 * 查询所有
	 */
	public List<T> findAll() throws Exception;


}
