package com.honor.ssm.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.honor.ssm.entity.TUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.Map;

/**
 * <p>
 * 用户信息表 Mapper 接口
 * </p>
 *
 * @author daitianci
 * @since 2019-03-07
 */
public interface TUserMapper extends BaseMapper<TUser> {
    public IPage<Map> customPage(Page page);
}
