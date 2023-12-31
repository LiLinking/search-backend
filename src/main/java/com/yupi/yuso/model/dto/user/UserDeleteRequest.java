package com.yupi.yuso.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * 删除
 */
@Data
public class UserDeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}