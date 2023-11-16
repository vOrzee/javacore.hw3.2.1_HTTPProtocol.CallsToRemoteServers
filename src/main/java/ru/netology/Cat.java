package ru.netology;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Cat {
    private final String id;
    private final String text;
    private final String type;
    private final String user;
    private final Integer upvotes;

    // Конструктор со всеми параметрами для удобства создания объектов
    public Cat(
            @JsonProperty("id") String id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") String user,
            @JsonProperty("upvotes") Integer upvotes
    ) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    // Если вам нужны сеттеры, можно добавить @Setter на уровне класса или поля
}

