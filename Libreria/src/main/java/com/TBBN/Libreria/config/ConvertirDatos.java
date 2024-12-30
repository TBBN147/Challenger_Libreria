package com.TBBN.Libreria.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.TBBN.Libreria.config.iConfig.IConvertirDatos;
import com.fasterxml.jackson.databind.ObjectMapper;


public class ConvertirDatos implements IConvertirDatos {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public <T> T convertirDatosJsonAJava(String json, Class<T> clase) {
        try {
            return objectMapper.readValue(json, clase);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

}
