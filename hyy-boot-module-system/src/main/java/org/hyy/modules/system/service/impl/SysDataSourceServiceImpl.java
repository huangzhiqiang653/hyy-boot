package org.hyy.modules.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.hyy.modules.system.service.ISysDataSourceService;
import org.hyy.modules.system.entity.SysDataSource;
import org.hyy.modules.system.mapper.SysDataSourceMapper;
import org.hyy.modules.system.service.ISysDataSourceService;
import org.springframework.stereotype.Service;

/**
 * @Description: 多数据源管理
 * @Author: 黄智强
 * @Date: 2019-12-25
 * @Version: V1.0
 */
@Service
public class SysDataSourceServiceImpl extends ServiceImpl<SysDataSourceMapper, SysDataSource> implements ISysDataSourceService {

}
