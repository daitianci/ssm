package com.honor.ssm.service;

import com.honor.ssm.entity.TUser;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 用户信息表 服务类
 * </p>
 *
 * @author daitianci
 * @since 2019-03-27
 */
public interface ITUserService extends IService<TUser> {

    TUser saveNew(TUser user);

    TUser getByIdNew(Integer id);

    TUser updateByIdNew(TUser user);

    List<TUser> listNew();
}
