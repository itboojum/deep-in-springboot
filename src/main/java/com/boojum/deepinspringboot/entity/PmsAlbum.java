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
 * 相册表
 * </p>
 *
 * @author boojum
 * @since 2020-04-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PmsAlbum extends Model<PmsAlbum> {

    private static final long serialVersionUID=1L;

    private String name;

    private String coverPic;

    private Integer picCount;

    private Integer sort;

    private String description;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
