package com.boojum.deepinspringboot.service.impl;

import com.boojum.deepinspringboot.entity.PmsProductCategoryAttributeRelation;
import com.boojum.deepinspringboot.mapper.PmsProductCategoryAttributeRelationMapper;
import com.boojum.deepinspringboot.service.PmsProductCategoryAttributeRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品的分类和属性的关系表，用于设置分类筛选条件（只支持一级分类） 服务实现类
 * </p>
 *
 * @author boojum
 * @since 2020-04-05
 */
@Service
public class PmsProductCategoryAttributeRelationServiceImpl extends ServiceImpl<PmsProductCategoryAttributeRelationMapper, PmsProductCategoryAttributeRelation> implements PmsProductCategoryAttributeRelationService {

}
