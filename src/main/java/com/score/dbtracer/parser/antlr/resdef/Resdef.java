package com.score.dbtracer.parser.antlr.resdef;


import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;


/**
 * Root of the Resdef model to describe the entity stores.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class Resdef {
    private String       schema   = "";
    private List<Entity> entities = new ArrayList<Entity>();


    public Entity getEntityForName(final String name) {
        for (final Entity entity : entities) {
            if (entity.getName().equalsIgnoreCase(name)) {
                return entity;
            }
        }
        return null;
    }
}
