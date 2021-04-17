package com.csi.msscjacksonexample.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("kebab")
@JsonTest
public class BeerDtoKebabTest extends BaseTest{
    @Autowired
    ObjectMapper objectMapper;

    @Test
    void kebabTest() throws JsonProcessingException {
        BeerDto beerdto=getDto();
        String json=objectMapper.writeValueAsString(beerdto);
        System.out.println(json);
    }
}

