package com.tasks.test.vkapibot;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
@Getter

public class AppConfig
{
    @Value("${token.confirmation}")
    public String confirmationToken;

    @Value("${token.access}")
    public String accessToken;

    @Value("${secret.key}")
    public String secretKey;
}
