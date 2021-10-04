package com.hoffnung.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Map;

@ExtendWith(MockitoExtension.class)
public class MockExtension {

    @Mock
    Map<String,Object> mockMap;

    @Test
    void mapMockTest(){
        mockMap.put("a","A");
    }
}
