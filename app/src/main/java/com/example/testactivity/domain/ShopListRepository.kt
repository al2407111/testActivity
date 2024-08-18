package com.example.testactivity.domain

interface ShopListRepository {
    fun addShopItem(shopItem: ShopItem)
    fun deleteShopItemUseCase(shopItem: ShopItem)
    fun editShopItemUseCase(shopItem: ShopItem)
    fun getShopItem(shopItemId: Int): ShopItem
    fun getShopListUseCase():List<ShopItem>
}