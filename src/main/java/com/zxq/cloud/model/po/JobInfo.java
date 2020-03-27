package com.zxq.cloud.model.po;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author zxq
 */
@Table(name = "zxq_job_info")
@Data
public class JobInfo {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 请求路径
     */
    private String url;

    /**
     * 请求方式 GET POST
     */
    private String method;

    /**
     * 标题
     */
    private String title;

    /**
     * corn表达式
     */
    private String corn;

    /**
     * 请求参数
     */
    private String params;

    /**
     * 备注
     */
    private String remark;

    /**
     * 分组id，关联zxq_job_group
     */
    @Column(name = "job_group_id")
    private Integer jobGroupId;

    /**
     * 任务状态 -1 已删除；0 已暂停； 1 运行中
     */
    private Integer status;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * quartz中任务的唯一标识
     */
    @Column(name = "job_key")
    private String jobKey;
}