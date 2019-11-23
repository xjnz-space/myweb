package com.quge.myweb.entity;


import lombok.Data;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class User {
    @Id
	private Integer userId;
	/**
	 * 昵称
	 */
	@ApiModelProperty(value = "昵称", position = 1)
	private String nickname;
	/**
	 * 用户名账号
	 */
	@ApiModelProperty(value = "用户名账号", position = 2)
	private String username;
	/**
	 * 邮箱
	 */
	@ApiModelProperty(value = "邮箱", position = 3)
	private String email;
	/**
	 * 账号创建时间
	 */
	@ApiModelProperty(value = "账号创建时间", position = 4)
	private java.util.Date created;
	/**
	 * 等级
	 */
	@ApiModelProperty(value = "等级", position = 5)
	private Integer lv;
	/**
	 * 等级名称
	 */
	@ApiModelProperty(value = "等级名称", position = 6)
	private String lvName;


}
