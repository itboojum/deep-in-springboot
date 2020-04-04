package com.boojum.deepinspringboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 首页推荐专题表
 * </p>
 *
 * @author boojum
 * @since 2020-04-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SmsHomeRecommendSubject extends Model<SmsHomeRecommendSubject> {

    private static final long serialVersionUID=1L;

    private Long subjectId;

    private String subjectName;

    private Integer recommendStatus;

    private Integer sort;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
