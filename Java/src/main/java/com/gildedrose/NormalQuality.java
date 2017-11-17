package com.gildedrose;

public class NormalQuality implements Quality {

    @Override
    public void update(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }
}
