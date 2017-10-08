package com.gildedrose;

class GildedRose {

    private Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : this.items) {
            ItemCategory category = this.categorizeItem(item);
            this.updateQualityForOneItem(item, category);
        }
    }

    private ItemCategory categorizeItem(Item item) {
        if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
            return new SulfurasCategory();
        } else if (item.name.equals("Aged Brie")) {
            return new CheeseCategory();
        } else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            return new BackstagePassCategory();
        }
        return new RegularItemCategory();
    }

    private void updateQualityForOneItem(Item item, ItemCategory category) {
        category.updateQuality(item);
        category.updateSellIn(item);

        if (this.hasExpired(item))
            category.updateExpired(item);
    }

    private boolean hasExpired(Item item) {
        return item.sellIn < 0;
    }

    @Override
    public String toString() {
        String str = "";
        for (Item i : this.items) {
            str += i.toString();
            str += "\n";
        }
        return str;
    }
}