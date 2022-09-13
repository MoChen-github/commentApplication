package com.example.comment.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import sun.plugin.javascript.navig4.Layer;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class Comments implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.ASSIGN_ID)
    private String id;

    private String userId;

    private String goodsId;

    private Integer Layer;

    private String parentId;

    private Double score;

    private Integer stars;

    private String commentDetails;

    private List<String> imgUrl;

    private boolean isDelete;

    private Date createDate;

    private Date optionDate;

}
