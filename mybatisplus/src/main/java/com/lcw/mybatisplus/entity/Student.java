package com.lcw.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("student") //对应表名
public class Student implements Serializable {

    //对应id，可不填
    @TableId(value = "id")
    private int id;

    //对应字段名，如果属性名和字段名一致，可不填
    @TableField("name")
    private String name;

}