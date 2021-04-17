package com.csi.msscjacksonexample.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

@JsonTest
class BeerDtoTest extends BaseTest {
    @Autowired
    ObjectMapper objectMapper;

    @Test
        //serializing to json
    void testSerializeDto() throws JsonProcessingException {
        BeerDto beerDto = getDto();
        String jsonString = objectMapper.writeValueAsString(beerDto);
        System.out.println(jsonString);

    }

    @Test
        //json to object
    void testDeserialize() throws JsonProcessingException {
        String json = "{\"beerName\":\"BeerName\",\"beerStyle\":\"Ale\",\"upc\":123123123,\"price\":\"12.99\",\"createdDate\":\"2021-04-17T18:06:58+0530\",\"lastUpdatedDate\":\"2021-04-17T18:06:58.8236075+05:30\",\"myLocalDate\":\"20210417\",\"beerId\":\"7a5a0986-413d-45a7-83b1-b771b1503b00\"}\n";
        BeerDto dto = objectMapper.readValue(json, BeerDto.class);
        System.out.println(dto);
    }

}