package com.gildedrose;

public class LegendaryQuality extends Quality {
    @Override
    public void update(Item item) {

    }

    @Override
    protected void expires(Item item) {

    }

    @Override
    public boolean applies(Item item) {
        return "Sulfuras, Hand of Ragnaros".equals(item.name);
    }
}
