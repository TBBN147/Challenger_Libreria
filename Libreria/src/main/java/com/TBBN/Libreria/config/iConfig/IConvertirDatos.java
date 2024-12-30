package com.TBBN.Libreria.config.iConfig;

public interface IConvertirDatos {
    <T> T convertirDatosJsonAJava(String json , Class<T> clase);
}
