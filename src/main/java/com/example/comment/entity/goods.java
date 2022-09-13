package com.example.comment.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Data
public class goods implements Serializable {
    private static final long serialVersionUID = 1L;

    /**主键*/
    @TableId(type = IdType.ASSIGN_ID)
    private String id;

    /**创建人ID*/
    private String createUserId;

    /**添加时间*/
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createTime;

    /**创建人所属部门*/
    private String createUserOrgNo;

    /**修改人ID*/
    private String updateUserId;
    /**修改时间*/
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updateTime;

    /**所属部门*/
    private String sysOrgCode;

    /**名称*/
    private String name;

    /**删除状态 0：已删除 1：正常*/
    private Integer isDelete;



}
