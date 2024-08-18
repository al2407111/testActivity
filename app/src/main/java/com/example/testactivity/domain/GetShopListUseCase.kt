package com.example.testactivity.domain

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {
    fun getShopListUseCase():List<ShopItem>{
      return  shopListRepository.getShopListUseCase()
    }
}