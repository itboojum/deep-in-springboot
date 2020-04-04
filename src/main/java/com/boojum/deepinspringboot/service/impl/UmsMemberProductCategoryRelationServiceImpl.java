package com.boojum.deepinspringboot.service.impl;

import com.boojum.deepinspringboot.entity.UmsMemberProductCategoryRelation;
import com.boojum.deepinspringboot.mapper.UmsMemberProductCategoryRelationMapper;
import com.boojum.deepinspringboot.service.UmsMemberProductCategoryRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员与产品分类关系表（用户喜欢的分类） 服务实现类
 * </p>
 *
 * @author boojum
 * @since 2020-04-05
 */
@Service
public class UmsMemberProductCategoryRelationServiceImpl extends ServiceImpl<UmsMemberProductCategoryRelationMapper, UmsMemberProductCategoryRelation> implements UmsMemberProductCategoryRelationService {

}
