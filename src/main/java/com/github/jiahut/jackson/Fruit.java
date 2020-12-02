package com.github.jiahut.jackson;

import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY,property = "name")
@JsonSubTypes(value = {
        @JsonSubTypes.Type(value = Apple.class, name = "apple"),
        @JsonSubTypes.Type(value = Peach.class, name = "peach"),
})
public interface Fruit {
}
