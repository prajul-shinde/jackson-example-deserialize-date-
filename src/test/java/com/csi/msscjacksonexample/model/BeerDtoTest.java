package com.csi.msscjacksonexample.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import static org.junit.jupiter.api.Assertions.*;

@JsonTest
class BeerDtoTest extends BaseTest{
    @Autowired
    ObjectMapper objectMapper;

    @Test
    //serializing to json
    void testSerializeDto() throws JsonProcessingException {
        BeerDto beerDto=getDto();
        String jsonString=objectMapper.writeValueAsString(beerDto);
        System.out.println(jsonString);

    }
    @Test
    //json to object
    void testDeserialize() throws JsonProcessingException {
        String json="{\"beerId\":\"8ef68ea2-fde6-4fc3-a424-40fec4227559\",\"beerName\":\"BeerName\",\"beerStyle\":\"Ale\",\"upc\":123123123,\"price\":12.99,\"createdDate\":\"2021-04-17T16:23:08.7738288+05:30\",\"lastUpdatedDate\":\"2021-04-17T16:23:08.7738288+05:30\"}\n";
        BeerDto dto = objectMapper.readValue(json, BeerDto.class);
        System.out.println(dto);
    }

}