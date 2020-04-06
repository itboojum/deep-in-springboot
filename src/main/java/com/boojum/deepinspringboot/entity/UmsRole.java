package com.boojum.deepinspringboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
* @author boojum
* @since 2020-04-06
*/
@ApiModel(value ="后台用户角色表")
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UmsRole extends Model<UmsRole> {

    private static final long serialVersionUID = 1L;

        @TableId(value = "id", type = IdType.AUTO)
        private Long id;
    @ApiModelProperty(value = "名称")
    private String name;
    @ApiModelProperty(value = "描述")
    private String description;
    @ApiModelProperty(value = "后台用户数量")
    private Integer adminCount;
    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;
    @ApiModelProperty(value = "启用状态：0->禁用；1->启用")
    private Integer status;
    private Integer sort;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
