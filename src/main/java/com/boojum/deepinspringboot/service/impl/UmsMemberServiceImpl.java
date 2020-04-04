package com.boojum.deepinspringboot.service.impl;

import com.boojum.deepinspringboot.entity.UmsMember;
import com.boojum.deepinspringboot.mapper.UmsMemberMapper;
import com.boojum.deepinspringboot.service.UmsMemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author boojum
 * @since 2020-04-05
 */
@Service
public class UmsMemberServiceImpl extends ServiceImpl<UmsMemberMapper, UmsMember> implements UmsMemberService {

}
