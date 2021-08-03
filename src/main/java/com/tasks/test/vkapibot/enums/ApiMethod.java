package com.tasks.test.vkapibot.enums;

import com.tasks.test.vkapibot.Constants;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ApiMethod
{
    MESSAGE_SEND(Constants.VK_API_METHOD_MESSAGE_SEND);

    private final String methodPath;
}
