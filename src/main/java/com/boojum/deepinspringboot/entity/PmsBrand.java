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
* @since 2020-04-05
*/
@ApiModel(value ="品牌表")
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PmsBrand extends Model<PmsBrand> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private String name;
    @ApiModelProperty(value = "首字母")
    private String firstLetter;
    private Integer sort;
    @ApiModelProperty(value = "是否为品牌制造商：0->不是；1->是")
    private Integer factoryStatus;
    private Integer showStatus;
    @ApiModelProperty(value = "产品数量")
    private Integer productCount;
    @ApiModelProperty(value = "产品评论数量")
    private Integer productCommentCount;
    @ApiModelProperty(value = "品牌logo")
    private String logo;
    @ApiModelProperty(value = "专区大图")
    private String bigPic;
    @ApiModelProperty(value = "品牌故事")
    private String brandStory;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
