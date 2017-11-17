package com.gildedrose;

public class Legendary extends Quality {
    @Override
    public void updateQuality(Item item) {

    }

    @Override
    public void updateSellIn(Item item) {

    }

    @Override
    public void updateExpired(Item item) {

    }

    @Override
    public boolean hasExpired(Item item) {
        return false;
    }

    @Override
    public boolean applies(Item item) {
        return "Sulfuras, Hand of Ragnaros".equals(item.name);
    }
}
