package com.tasks.test.vkapibot.entites;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tasks.test.vkapibot.Constants;
import com.tasks.test.vkapibot.enums.ApiCallback;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Event
{
    @JsonProperty(Constants.EVENT_TYPE)
    private ApiCallback type;

    @JsonProperty(Constants.EVENT_GROUP_ID)
    private Long groupId;

    @JsonProperty(Constants.EVENT_ID)
    private String eventId;

    @JsonProperty(Constants.EVENT_SECRET)
    private String secret;

    @JsonValue
    @JsonProperty(Constants.EVENT_OBJECT)
    private EventObject eventObject;

    @Override
    public String toString()
    {
        String message;

        if (type == ApiCallback.MESSAGE_NEW)
        {
            message = "type: '" + type.name() + "', body: '" +
                    eventObject.getBody() + "', from user_id: " +
                    eventObject.getUserId();
        }
        else
        {
            message = "type: '" + type.name() + "', body: '" +
                    eventObject.getBody() + "', to user_id: " +
                    eventObject.getUserId();
        }

        return message;
    }
}
