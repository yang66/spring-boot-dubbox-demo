package com.github.springbootdubboxdemo.api.model;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 用户实体
 *
 * @author: lvhao
 * @since: 2016-10-13 16:03
 */
public class UserModel implements Serializable{

    @NotNull
    @Min(1)
    private Long id;

    @NotNull
    @Length(min = 4, max = 20)
    private String name;

    @NotNull
    @Length(min = 11,max = 11)
    private String mobile;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserModel{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", mobile='").append(mobile).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
