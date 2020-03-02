package org.hyy.modules.monitor.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hyy.modules.monitor.domain.RedisInfo;
import org.hyy.modules.monitor.exception.RedisConnectException;
import org.hyy.modules.monitor.domain.RedisInfo;
import org.hyy.modules.monitor.exception.RedisConnectException;

public interface RedisService {

	/**
	 * 获取 redis 的详细信息
	 *
	 * @return List
	 */
	List<RedisInfo> getRedisInfo() throws RedisConnectException;

	/**
	 * 获取 redis key 数量
	 *
	 * @return Map
	 */
	Map<String, Object> getKeysSize() throws RedisConnectException;

	/**
	 * 获取 redis 内存信息
	 *
	 * @return Map
	 */
	Map<String, Object> getMemoryInfo() throws RedisConnectException;

}
