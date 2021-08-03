package com.tasks.test.vkapibot.service;

import com.tasks.test.vkapibot.AppConfig;
import com.tasks.test.vkapibot.entites.Event;
import com.tasks.test.vkapibot.enums.ApiCallback;
import com.tasks.test.vkapibot.enums.ApiMethod;
import com.tasks.test.vkapibot.response.DefaultResponse;
import lombok.RequiredArgsConstructor;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class VkApiService
{
    private static final Logger LOG = Logger.getLogger(VkApiService.class);
    private final AppConfig config;

    public String doResponse(Event event)
    {
        if (!event.getSecret().equals(config.getSecretKey()))
        {
            LOG.error("Received secret key does not match the one specified in " +
                    "the application.yaml configuration: " + event.getSecret());

            return "error";
        }

        LOG.debug("Received: " + event.toString());

        if (event.getType() == ApiCallback.CONFIRMATION)
        {
            return config.getConfirmationToken();
        }
        else if (event.getType() == ApiCallback.MESSAGE_NEW)
        {
            new DefaultResponse(event, config.accessToken).processResponse(ApiMethod.MESSAGE_SEND);
        }
        return "ok";
    }
}