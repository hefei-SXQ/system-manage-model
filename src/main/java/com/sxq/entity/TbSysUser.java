package com.sxq.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * @Auther sun
 * @Date 2019/10/20 15:16
 * @Discription example
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TbSysUser implements Serializable {
    private static final long serialVersionUID = -339516038496531943L;

    private Integer userId;
    private String loginName;
    private String password;
    private String realName;
    private Integer orgId;
    private String phoneNo;
    private String email;
    private String qq;
    private Integer creator;
    private Date createTime;
    private Integer updator;
    private Date updateTime;
    private String status;
}
