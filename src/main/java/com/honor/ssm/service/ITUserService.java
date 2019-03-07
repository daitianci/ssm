package com.honor.ssm.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.honor.ssm.entity.TUser;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * <p>
 * 用户信息表 服务类
 * </p>
 *
 * @author daitianci
 * @since 2019-03-07
 */
public interface ITUserService extends IService<TUser> {

    IPage<Map> customPage(Integer page, Integer rows);
}
