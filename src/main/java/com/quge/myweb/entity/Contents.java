package com.quge.myweb.entity;


import lombok.Data;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Contents {
    @Id
	private Integer cid;

	/**
	 * 文章标题
	 */
	@ApiModelProperty(value = "文章标题", position = 1)
	private String title;

	/**
	 * url地址
	 */
	@ApiModelProperty(value = "url地址", position = 2)
	private String slug;

	/**
	 * 创建时间
	 */
	@ApiModelProperty(value = "创建时间", position = 3)
	private java.util.Date creted;

	/**
	 * 修改时间
	 */
	@ApiModelProperty(value = "修改时间", position = 4)
	private java.util.Date modified;

	/**
	 * 文章内容
	 */
	@ApiModelProperty(value = "文章内容", position = 5)
	private String content;

	/**
	 * 作者id
	 */
	@ApiModelProperty(value = "作者id", position = 6)
	private Integer authorId;

	/**
	 * 文章类型
	 */
	@ApiModelProperty(value = "文章类型", position = 7)
	private String type;

	/**
	 * 文章状态
	 */
	@ApiModelProperty(value = "文章状态", position = 8)
	private String status;

	/**
	 * 分类
	 */
	@ApiModelProperty(value = "分类", position = 9)
	private String categories;

	/**
	 * 缩略图地址
	 */
	@ApiModelProperty(value = "缩略图地址", position = 10)
	private String thumblmg;

	/**
	 * 文章点击量
	 */
	@ApiModelProperty(value = "文章点击量", position = 11)
	private Integer hits;

	/**
	 * 评论数量
	 */
	@ApiModelProperty(value = "评论数量", position = 12)
	private Integer comments;

	/**
	 * 允许评论
	 */
	@ApiModelProperty(value = "允许评论", position = 13)
	private Integer allow_Comment;


}
