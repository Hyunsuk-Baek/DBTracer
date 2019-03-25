package com.score.dbtracer.parser.antlr.resdef;

import lombok.Getter;
import lombok.Setter;

/**
 * Entity field
 */
@Getter
@Setter
public class Field {

    private String  name;
    private String  type;
    private Boolean isPrimaryKey;
    private Boolean nullable;
    private String  defaultValue;
    private Integer minOccurs;
    private String  maxOccurs;

}
