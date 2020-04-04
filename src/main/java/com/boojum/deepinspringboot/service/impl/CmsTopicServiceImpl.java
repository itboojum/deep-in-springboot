package com.boojum.deepinspringboot.service.impl;

import com.boojum.deepinspringboot.entity.CmsTopic;
import com.boojum.deepinspringboot.mapper.CmsTopicMapper;
import com.boojum.deepinspringboot.service.CmsTopicService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 话题表 服务实现类
 * </p>
 *
 * @author boojum
 * @since 2020-04-05
 */
@Service
public class CmsTopicServiceImpl extends ServiceImpl<CmsTopicMapper, CmsTopic> implements CmsTopicService {

}
