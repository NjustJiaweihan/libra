package com.dream.libra.po;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
public class OptLog extends BasePO{

    private String optUser;

    private String optContent;

    private String optType;

    private Date optTime;
}
