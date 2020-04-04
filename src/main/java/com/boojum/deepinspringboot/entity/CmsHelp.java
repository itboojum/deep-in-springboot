package com.boojum.deepinspringboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 帮助表
 * </p>
 *
 * @author boojum
 * @since 2020-04-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CmsHelp extends Model<CmsHelp> {

    private static final long serialVersionUID=1L;

    private Long categoryId;

    private String icon;

    private String title;

    private Integer showStatus;

    private LocalDateTime createTime;

    private Integer readCount;

    private String content;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
