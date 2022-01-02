package com.example.springbootmongodb.repository;

public interface CustomItemRepository {
    void updateItemQuantity(String name, float newQuantity);
}
