package com.hoffnung.junit;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Map;


public class AnnotaionBasedMocking {

    @Mock
    Map<String,Object> mockMap;

    @BeforeEach
    void setup(){
        MockitoAnnotations.openMocks(this);
    }


    @Test
    void testMap(){
        mockMap.put("a","A");

    }
}
