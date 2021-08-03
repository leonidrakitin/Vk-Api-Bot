package com.tasks.test.vkapibot.controller;

import com.tasks.test.vkapibot.entites.Event;
import com.tasks.test.vkapibot.service.VkApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/", produces = APPLICATION_JSON_VALUE)
public class VkApiController
{
    private final VkApiService service;

    @PostMapping
    public String doResponse(@RequestBody Event event) throws Exception
    {
        return service.doResponse(event);
    }
}
