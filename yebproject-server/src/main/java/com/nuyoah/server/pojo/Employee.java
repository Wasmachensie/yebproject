package com.nuyoah.server.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName t_employee
 */
@TableName(value ="t_employee")
@Data
public class Employee implements Serializable {
    /**
     * 员工编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 员工姓名
     */
    @TableField(value = "name")
    private String name;

    /**
     * 性别
     */
    @TableField(value = "gender")
    private String gender;

    /**
     * 出生日期
     */
    @TableField(value = "birthday")
    private Date birthday;

    /**
     * 身份证号
     */
    @TableField(value = "idCard")
    private String idCard;

    /**
     * 婚姻状况
     */
    @TableField(value = "wedlock")
    private Object wedlock;

    /**
     * 民族
     */
    @TableField(value = "nationId")
    private Integer nationId;

    /**
     * 籍贯
     */
    @TableField(value = "nativePlace")
    private String nativePlace;

    /**
     * 政治面貌
     */
    @TableField(value = "politicId")
    private Integer politicId;

    /**
     * 邮箱
     */
    @TableField(value = "email")
    private String email;

    /**
     * 电话号码
     */
    @TableField(value = "phone")
    private String phone;

    /**
     * 联系地址
     */
    @TableField(value = "address")
    private String address;

    /**
     * 所属部门
     */
    @TableField(value = "departmentId")
    private Integer departmentId;

    /**
     * 职称ID
     */
    @TableField(value = "jobLevelId")
    private Integer jobLevelId;

    /**
     * 职位ID
     */
    @TableField(value = "posId")
    private Integer posId;

    /**
     * 聘用形式
     */
    @TableField(value = "engageForm")
    private String engageForm;

    /**
     * 最高学历
     */
    @TableField(value = "tiptopDegree")
    private Object tiptopDegree;

    /**
     * 所属专业
     */
    @TableField(value = "specialty")
    private String specialty;

    /**
     * 毕业院校
     */
    @TableField(value = "school")
    private String school;

    /**
     * 入职日期
     */
    @TableField(value = "beginDate")
    private Date beginDate;

    /**
     * 在职状态
     */
    @TableField(value = "workState")
    private Object workState;

    /**
     * 工号
     */
    @TableField(value = "workID")
    private String workID;

    /**
     * 合同期限
     */
    @TableField(value = "contractTerm")
    private Double contractTerm;

    /**
     * 转正日期
     */
    @TableField(value = "conversionTime")
    private Date conversionTime;

    /**
     * 离职日期
     */
    @TableField(value = "notWorkDate")
    private Date notWorkDate;

    /**
     * 合同起始日期
     */
    @TableField(value = "beginContract")
    private Date beginContract;

    /**
     * 合同终止日期
     */
    @TableField(value = "endContract")
    private Date endContract;

    /**
     * 工龄
     */
    @TableField(value = "workAge")
    private Integer workAge;

    /**
     * 工资账套ID
     */
    @TableField(value = "salaryId")
    private Integer salaryId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}