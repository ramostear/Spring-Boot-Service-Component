package com.ramostear.application.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author ramostear
 * @create-time 2019/3/6 0006-3:12
 * @modify by :
 * @since:
 */
@Getter
@Setter
@NoArgsConstructor
public class User {
    private long id;
    private String name;

    public User setId(long id){
        this.id = id;
        return this;
    }

    public User setName(String name){
        this.name = name;
        return this;
    }
}
