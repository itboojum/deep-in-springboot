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
@ApiModel(value ="后台用户表")
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UmsAdmin extends Model<UmsAdmin> {

    private static final long serialVersionUID = 1L;

        @TableId(value = "id", type = IdType.AUTO)
        private Long id;
    private String username;
    private String password;
    @ApiModelProperty(value = "头像")
    private String icon;
    @ApiModelProperty(value = "邮箱")
    private String email;
    @ApiModelProperty(value = "昵称")
    private String nickName;
    @ApiModelProperty(value = "备注信息")
    private String note;
    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;
    @ApiModelProperty(value = "最后登录时间")
    private LocalDateTime loginTime;
    @ApiModelProperty(value = "帐号启用状态：0->禁用；1->启用")
    private Integer status;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
