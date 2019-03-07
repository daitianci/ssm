package com.honor.ssm.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.honor.ssm.entity.TUser;
import com.honor.ssm.mapper.TUserMapper;
import com.honor.ssm.service.ITUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author daitianci
 * @since 2019-03-07
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements ITUserService {
    @Resource
    TUserMapper userMapper;

    @Override
    public IPage<Map> customPage(Integer page, Integer rows) {
        return userMapper.customPage(new Page(page, rows));
    }
}
