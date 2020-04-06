package com.boojum.deepinspringboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
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
@ApiModel(value ="后台用户角色和权限关系表")
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UmsRolePermissionRelation extends Model<UmsRolePermissionRelation> {

    private static final long serialVersionUID = 1L;

        @TableId(value = "id", type = IdType.AUTO)
        private Long id;
    private Long roleId;
    private Long permissionId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
