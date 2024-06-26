package com.alura.literatura2024.service;

public interface IDadosConverter {
    <T> T getData(String json, Class<T> classe);
}
