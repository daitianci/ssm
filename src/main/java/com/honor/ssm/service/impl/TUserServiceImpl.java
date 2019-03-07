package com.honor.ssm.service.impl;

import com.honor.ssm.entity.TUser;
import com.honor.ssm.mapper.TUserMapper;
import com.honor.ssm.service.ITUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author daitianci
 * @since 2019-03-07
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements ITUserService {

}
