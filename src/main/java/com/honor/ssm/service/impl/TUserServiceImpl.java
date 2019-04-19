package com.honor.ssm.service.impl;

import com.honor.ssm.entity.TUser;
import com.honor.ssm.entity.User;
import com.honor.ssm.mapper.TUserMapper;
import com.honor.ssm.service.ITUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author daitianci
 * @since 2019-03-27
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements ITUserService {
    @Override
    @CachePut(value = "userCache",key = "#user.getId().toString()")
    public TUser saveNew(TUser user) {
        super.save(user);
        return user;
    }

    @Override
    @Cacheable(value = "userCache",key = "#id.toString()")
    public TUser getByIdNew(Integer id) {
        return super.getById(id);
    }

    @Override
    @CacheEvict(cacheNames = "userCache", allEntries = true)
    public List<TUser> listNew() {
        return super.list();
    }
}
