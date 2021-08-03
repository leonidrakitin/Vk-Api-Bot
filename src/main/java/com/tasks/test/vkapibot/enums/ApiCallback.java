package com.tasks.test.vkapibot.enums;

import com.tasks.test.vkapibot.Constants;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ApiCallback
{
    MESSAGE_REPLY(Constants.CALLBACK_API_EVENT_MESSAGE_REPLAY),
    CONFIRMATION(Constants.CALLBACK_API_EVENT_CONFIRMATION),
    MESSAGE_NEW(Constants.CALLBACK_API_EVENT_MESSAGE_NEW);

    @JsonValue
    private final String type;
}
