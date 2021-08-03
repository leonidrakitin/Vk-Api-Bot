package com.tasks.test.vkapibot.entites;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tasks.test.vkapibot.Constants;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EventObject
{
    @JsonProperty(Constants.EVENT_OBJECT_ID)
    private int id;

    @JsonProperty(Constants.EVENT_OBJECT_DATE)
    private int date;

    @JsonProperty(Constants.EVENT_OBJECT_OUT)
    private int out;

    @JsonProperty(Constants.EVENT_OBJECT_USER_ID)
    private int userId;

    @JsonProperty(Constants.EVENT_OBJECT_READ_STATE)
    private int readState;

    @JsonProperty(Constants.EVENT_OBJECT_TITLE)
    private String title;

    @JsonProperty(Constants.EVENT_OBJECT_BODY)
    private String body;
}
