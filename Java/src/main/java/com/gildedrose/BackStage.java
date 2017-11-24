package com.gildedrose;

/**
 * Created by sbertran on 3/11/17.
 */
public class BackStage extends BaseItem {

    private static final int PASS_SELL_IN_FIRST_LIMIT = 10;
    private static final int PASS_SELL_IN_SECOND_LIMIT = 5;

    public BackStage(Item item) {
        super(item);
    }

    public void updateQuality() {
        increaseQuality(item);
        if (item.sellIn <= PASS_SELL_IN_FIRST_LIMIT) {
            increaseQuality(item);
        }

        if(item.sellIn <= PASS_SELL_IN_SECOND_LIMIT) {
            increaseQuality(item);
        }
    }

    @Override
    public void updateExpired() {
        item.quality = 0;
    }
}
