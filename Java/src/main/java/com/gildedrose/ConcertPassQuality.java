package com.gildedrose;

public class ConcertPassQuality implements Quality {
    private static final int PASS_SELL_IN_FIRST_LIMIT = 10;
    private static final int PASS_SELL_IN_SECOND_LIMIT = 5;

    @Override
    public void update(Item item) {
        increaseQuality(item);

        if (item.sellIn <= PASS_SELL_IN_FIRST_LIMIT)
            increaseQuality(item);

        if (item.sellIn <= PASS_SELL_IN_SECOND_LIMIT)
            increaseQuality(item);
    }

    private void increaseQuality(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }
}
